package day4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class TravelApp {
	public static void main(String[] args) {
		
	Flight f=new Flight("abc","Indian Airlines",5000,"India",LocalDateTime.of(2021, 05, 10, 11, 30),"Nepal",LocalDateTime.of(2021, 005, 12, 4, 56),12,true);	
	//Flight f1=new Flight("dsa","Kingfigher Airlines",6000,"Delhi",LocalDateTime.of(2021, 04, 28, 11, 24),"Mumbai",LocalDateTime.of(2021, 04, 30, 3, 46),14,false);
	/* Write code to call Flight constructor and Flight class setter methods*/
	//Flight flight = null;
	FlightDetails flightDetails = new FlightDetails();
	
	Hault temp=new Hault();
	temp.setAirportName("Hyderabad");
	
	temp.setDuration(2);
	f.calculateCost();
	
	

	flightDetails.printFlightDetails(f,temp);
	//flightDetails.printFlightDetails(f1);
	
	
	}
}
