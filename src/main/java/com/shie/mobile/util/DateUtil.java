package com.shie.mobile.util;

import java.util.Date;
import java.util.Calendar;

public class DateUtil {
	public static Date getCurrentDateTime() {
		Calendar calendar = Calendar.getInstance();
		return calendar.getTime();
	}
}
