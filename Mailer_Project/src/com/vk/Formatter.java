package com.vk;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Formatter {

	public static Date getSqlDate(String strDate)
	{
		Date sqlDate = null;
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date utilDate = format.parse(strDate);
			sqlDate = new Date(utilDate.getTime());			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return sqlDate;		
	}
	
	public static Date getCurrentDate()
	{
		Date sqlCurrentDate = null;
		try {
			java.util.Date utilDate = java.util.Calendar.getInstance().getTime();
			sqlCurrentDate = new Date(utilDate.getTime());			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return sqlCurrentDate;		
	}
}
