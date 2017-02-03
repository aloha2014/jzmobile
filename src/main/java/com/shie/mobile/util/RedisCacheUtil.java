package com.shie.mobile.util;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import redis.clients.util.SafeEncoder;

@Component
public class RedisCacheUtil {
	@Autowired
	private RedisTemplate<Serializable, Serializable> redisTemplate;

	/**
	 * 产生redis cache 指定key值对应的流水号
	 * 
	 * @param key
	 * @param incrementAmount
	 * @return
	 */
	public String generateSequenceNo(final String key, final long incrementAmount) {
		Long currentNo = redisTemplate.execute(new RedisCallback<Long>() {
			public Long doInRedis(final RedisConnection connection) throws DataAccessException {
				return connection.incrBy(SafeEncoder.encode(key), incrementAmount);
			}
		});
		return currentNo == null ? null : currentNo.toString();
	}

	/***
	 * 读取指定key值的redis cache对象
	 * 
	 * @param key
	 * @return
	 */
	public Serializable readObject(Serializable key) {
		ValueOperations<Serializable, Serializable> opsForValue = redisTemplate.opsForValue();
		return opsForValue.get(key);
	}

	/***
	 * 保存指定key值的redis cache对象
	 * 
	 * @param key
	 * @param value
	 * @param timeout
	 *            以秒为单位
	 */
	public void saveObject(Serializable key, Serializable value, long timeout) {
		ValueOperations<Serializable, Serializable> opsForValue = redisTemplate.opsForValue();
		opsForValue.set(key, value, timeout, TimeUnit.SECONDS);
	}

	/***
	 * 保存指定key值的redis cache对象
	 * 
	 * @param key
	 * @param value
	 */
	public void saveObject(Serializable key, Serializable value) {
		ValueOperations<Serializable, Serializable> opsForValue = redisTemplate.opsForValue();
		opsForValue.set(key, value);
	}
}
