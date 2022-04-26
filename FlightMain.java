package com.phase2.project.FlyAway;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FlightMain {
	public static void main(String[] args) {
		ArrayListData data= new ArrayListData();
		Scanner scanner = new Scanner(System.in);
		String departureLocation,arrivalLocation, flightClass, flightDate;
		int choice;
		System.out.println("Enter Departure Location");
		departureLocation=scanner.nextLine();
		System.out.println(" Enter Arrival Location");
		arrivalLocation=scanner.nextLine();
		System.out.println("Enter FlightClass \n'Flight Class' has two possible value like'E' and 'B'. E=Economy and B=Bussiness\n" + "");
		
		flightClass=scanner.nextLine().toUpperCase();
		System.out.println("Enter FlightDate");
		flightDate=scanner.next(); //.toUpperCase();
		
		System.out.println("Enter output preference \n.fare\n2.both fare and flight duration\n"+"");
		choice=scanner.nextInt();
		SearchFlight fd= new SearchFlight();
		try {
		fd.searchFlight(data.getArray(),departureLocation,arrivalLocation,flightClass,flightDate);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		fd.sortValue(choice);
		scanner.close();
	}

}
