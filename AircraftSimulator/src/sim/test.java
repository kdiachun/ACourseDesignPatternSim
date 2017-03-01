package sim;

import sim.flightTestEntry.FlightTestEntry;
import sim.flightTestEntry.FlightTestEntryFactory;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlightTestEntryFactory test = new FlightTestEntryFactory();
		FlightTestEntry entry =  test.createFlightTestEntry("[FLIGHT_TYPE]=DOMESTIC");
		
		entry.getEntryType();
	}

}
