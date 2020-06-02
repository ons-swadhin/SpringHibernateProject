package com.cg.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MyTest3 {

	public static void main(String[] args) {

		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		// Use Madrid's time zone to format the date in
		df.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));

		System.out.println("Date and time in Madrid: " + df.format(date));

		// Use India time zone to format the date in
		df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
		System.out.println("Date and time in India: " + df.format(date));

		// Use UTC Coordinated Universal Time time zone to format the date in
		df.setTimeZone(TimeZone.getTimeZone("UTC"));
		System.out.println("Date and time in UTC: " + df.format(date));
		
		System.out.println("UTC Date and time in India: " + df.format(date));

	}

	public static String convertUTCtoLocalTime(String p_city, String p_UTCDateTime) throws Exception {

		String lv_dateFormateInLocalTimeZone = "";// Will hold the final converted date
		Date lv_localDate = null;
		String lv_localTimeZone = "";
		SimpleDateFormat lv_formatter;
		SimpleDateFormat lv_parser;

		// Temp for testing(mapping of cities and timezones will eventually be in a
		// properties file
		if (p_city.equals("KOL")) {
			lv_localTimeZone = "Asia/Kolkata";
		} else if (p_city.equals("LON")) {
			lv_localTimeZone = "Europe/London";
		} else if (p_city.equals("NBI")) {
			lv_localTimeZone = "EAT";
		} else if (p_city.equals("BRS")) {
			lv_localTimeZone = "Europe/Brussels";
		} else if (p_city.equals("MNT")) {
			lv_localTimeZone = "America/Montreal";
		} else if (p_city.equals("LAS")) {
			lv_localTimeZone = "PST";
		}

		// create a new Date object using the UTC timezone
		lv_parser = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		lv_parser.setTimeZone(TimeZone.getTimeZone("UTC"));
		lv_localDate = lv_parser.parse(p_UTCDateTime);

		// Set output format - // prints "2007/10/25 18:35:07 EDT(-0400)"
		lv_formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z'('Z')'");
		System.out.println("convertUTCtoLocalTime " + p_city + ": " + "The Date in the UTC time zone(UTC) "
				+ lv_formatter.format(lv_localDate));

		// Convert the UTC date to Local timezone
		lv_formatter.setTimeZone(TimeZone.getTimeZone(lv_localTimeZone));
		lv_dateFormateInLocalTimeZone = lv_formatter.format(lv_localDate);
		System.out.println("convertUTCtoLocalTime: " + p_city + ": " + "The Date in the LocalTime Zone time zone "
				+ lv_formatter.format(lv_localDate));

		return lv_dateFormateInLocalTimeZone;
	}

}
