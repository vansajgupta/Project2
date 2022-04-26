package com.phase2.project.FlyAway;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SearchFlight {
	ArrayList<FlightDetails>list=new ArrayList<FlightDetails>();
	ShowFlightDetails show =new ShowFlightDetails();
	
	public void searchFlight(List<FlightDetails> list1,String deptLoc,String arrivalLoc,String data ,String FlightClass) throws FileNotFoundException{
		for(FlightDetails f: list1) {
			if(f.getDepartureLocation().equalsIgnoreCase(deptLoc)&& f.getArrivalLocation().equalsIgnoreCase(arrivalLoc)
					&& f.getSeatAvl().equalsIgnoreCase("y")&& (new DataChecker().isvalid(date, f.getFlightDate()))
					&& f.getFlightClass().equalsIgnoreCase(FlightClass) || f.getFlightClass().equalsIgnoreCase("EB")){
				FlightDetails d=new FlightDetails(f.getFlightTime(), f.getDepartureLocation(), f.getArrivalLocation(), f.getFlightTime(), f.getFlightDate(),f.getFlightDur(), f.getFare(),f.getFlightClass(),f.getSeatAvl());
				
				if (list1.get(7).equals("EB")) {
					d.setFare(f.getFare()+((0.4)*f.getFare()));
				}
						list.add(d);
					}
					
		}
	}
	public void sortValue(int choice) {
		if(choice==1) {
			Collections.sort(list,new Comparator<FlightDetails>() {
				public int compare(FlightDetails o1,FlightDetails o2) {
					return (int)(o1.getFare()- o2.getFare());
				}
			});
		} else if(choice==2) {
			Collections.sort(list,new Comparator<FlightDetails>() {
				public int compare(FlightDetails o1,FlightDetails o2) {
					return (int)(o1.getFlightDur()-o2.getFlightDur());
				}
			});
		}
		else { System.out.println("You have entered wrong choice");
		   return;
		}
		show.showDetails(list);
	}

}
