package day4;
import java.time.LocalDateTime;

import java.util.Scanner;

public class FlightDetails {
	public void printFlightDetails(Flight flight,Hault h)
	{
		
		 /*Write code to print the flight information and fare break up*/
	
	
		System.out.println("the flight number is: "+flight.getFlightNumber());
		System.out.println("the Airliner is: "+flight.getAirliner());
		System.out.println("the source is: "+flight.getSource());
		System.out.println("the fly date time is: "+flight.getFlyDateTime());
		System.out.println("the destination is:"+flight.getDestination());
		System.out.println("the arrival date time is:"+flight.getArrivalDateTime());
		System.out.println("Haults: ");
		//Hault h=new Hault();
		System.out.println("airport: "+h.getAirportName());
		System.out.println("duration: "+h.getDuration());
		if (flight.isFlyType())
		{
			System.out.println("the fly type is international");
		}
		else
		{
			System.out.println("the fly type is domestic");
		}
		
		System.out.println("----------FARE BREAKDOWN-------------");
		
		System.out.println("the base fair is: "+flight.getBaseFair());
		System.out.println("airport surge: "+flight.getBaseFair()*0.05);
		System.out.println("fuel charges: "+flight.getBaseFair()*0.3);
		System.out.println("the internation fly tax is:"+flight.getInternationFlyTax());
		System.out.println("the holiday tax is:"+flight.getHoliday_tax());
		System.out.println("the surge time: "+flight.getTime_tax());
		System.out.println("the international tax: "+flight.getInternationFlyTax());
		System.out.println("teh final fare: "+flight.getFinalCost());
	}
}

