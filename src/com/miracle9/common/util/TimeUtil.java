package com.miracle9.common.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeUtil {
	
	/**
	 * 判断两个日期时间是否是同一天
	 * @param timeStamp1  日期时间1 yyyy-mm-dd HH:MM:SS 
	 * @param timeStamp2  日期时间2 yyyy-mm-dd HH:MM:SS
	 * @return true是，false否
	 */
	public static boolean sameDay(String timeStamp1, String timeStamp2){
		String day1 = timeStamp1.split(" ")[0];
		String day2 = timeStamp2.split(" ")[0];
		if(day1.equals(day2)){
			return true;
		}
		return false;
	}
	
	/**
	 * 判断timeStamp1是否是timeStamp2的前一天
	 * @param timeStamp1  日期时间1 yyyy-mm-dd HH:MM:SS 
	 * @param timeStamp2  日期时间2 yyyy-mm-dd HH:MM:SS
	 * @return true是，false否
	 */
	public static boolean isYesterday(String timeStamp1, String timeStamp2){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try{
			Date date1 = sdf.parse(timeStamp1);
			Date date2 = sdf.parse(timeStamp2);
			Calendar calendar1=Calendar.getInstance();   
			calendar1.setTime(date1); 
			Calendar calendar2=Calendar.getInstance();   
			calendar2.setTime(date2);
			calendar1.add(Calendar.DAY_OF_YEAR, 1);
			if(calendar2.compareTo(calendar1) == 0){
				return true;
			}else{
				return false;
			}
		} catch(Exception ex){
			return false;
		}
	}
	
	/**
	 * 判断timeStamp1是否和timeStamp2是同一天
	 * @param timeStamp1
	 * @param timeStamp2
	 * @return
	 */
	public static boolean isSameToday(String timeStamp1, String timeStamp2){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try{
			Date date1 = sdf.parse(timeStamp1);
			Date date2 = sdf.parse(timeStamp2);
			Calendar calendar1=Calendar.getInstance();   
			calendar1.setTime(date1); 
			Calendar calendar2=Calendar.getInstance();   
			calendar2.setTime(date2);
			calendar1.add(Calendar.DAY_OF_YEAR, 0);
			if(calendar2.compareTo(calendar1) == 0){
				return true;
			}else{
				return false;
			}
		} catch(Exception ex){
			return false;
		}
	}
	
	public static String dateToString1(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}

	public static String getCurrentTimestamp() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());
	}

}
