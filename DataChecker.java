package com.phase2.project.FlyAway;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DataChecker {
	public boolean isValid(String date, String flightDate) {
		SimpleDateFormat sdfo = new SimpleDateFormat("dd-mm-yyyy");
		java.util.Date d1=null;
		try {
			d1= sdfo.parse(date);
		} catch (java.text.ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Date d2=null;
		try {
			d2=(Date) sdfo.parse(flightDate);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (d1.compareTo(d2)>0) {
			return false;
		}
		else if (d1.compareTo(d2)<0) {
			return true;
		}
		else if(d1.compareTo(d2)==0) {
			return true;
		}
		return false;
	}

}
