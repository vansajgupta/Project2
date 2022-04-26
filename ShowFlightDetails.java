package com.phase2.project.FlyAway;

import java.util.ArrayList;

public class ShowFlightDetails {
	public void showDetails(ArrayList<FlightDetails> flightlist) {
		for (FlightDetails details:flightlist) {
			System.out.println();
			System.out.println("\t |\t"+ details.getDepartureLocation());
			System.out.println("\t |\t"+ details.getArrivalLocation());
			System.out.println("\t |\t"+ details.getFlightDate());
			System.out.println("\t |\t"+ details.getFlightClass());
			System.out.println("\t |\t"+ details.getFare());
			System.out.println("\t |\t"+ details.getFlightDur());
			System.out.println("\t |\t"+ details.getSeatAvl());
		}
		if(flightlist.isEmpty())
			System.out.println("flight is not available write now");
		
	}

}
