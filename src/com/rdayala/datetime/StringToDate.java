package com.rdayala.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) throws Exception {
		String sDate1 = "31/12/1998";
		String sDate2 = "31-Dec-1998";
		String sDate3 = "12 31, 1998";
		String sDate4 = "Thu, Dec 31 1998";
		String sDate5 = "Thu, Dec 31 1998 23:37:50";
		String sDate6 = "31-Dec-1998 23:37:50";
		String sDate7 = "12/31/1998";
		
		SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MMM-yyyy");
		SimpleDateFormat formatter3 = new SimpleDateFormat("MM dd, yyyy");
		SimpleDateFormat formatter4 = new SimpleDateFormat("E, MMM dd yyyy");
		SimpleDateFormat formatter5 = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");
		SimpleDateFormat formatter6 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		SimpleDateFormat formatter7 = new SimpleDateFormat("MM/dd/yyyy");
		
		Date date1 = formatter1.parse(sDate1);
		Date date2 = formatter2.parse(sDate2);
		Date date3 = formatter3.parse(sDate3);
		Date date4 = formatter4.parse(sDate4);
		Date date5 = formatter5.parse(sDate5);
		Date date6 = formatter6.parse(sDate6);
		Date date7 = formatter7.parse(sDate7);
		
		System.out.println(sDate1 + "\t\t\t" + date1);
		System.out.println(sDate2 + "\t\t\t" + date2);
		System.out.println(sDate3 + "\t\t\t" + date3);
		System.out.println(sDate4 + "\t\t" + date4);
		System.out.println(sDate5 + "\t" + date5);
		System.out.println(sDate6 + "\t\t" + date6);
		System.out.println(sDate7 + "\t\t\t" + date7);
		
		System.out.println("LocalString : " + date7.toLocaleString());	// Dec 31, 1998 12:00:00 AM
		System.out.println("GMT String  : " + date7.toGMTString());		// 30 Dec 1998 18:30:00 GMT
	}

}
