package sim;

import java.util.ArrayList;

import sim.flightTestEntry.FlightTestEntry;
import sim.flightTestEntry.ParameterTestEntry;

public class FlightTest {
	
	ArrayList<FlightTestEntry> testEntries;
	ArrayList<ParameterTestEntry> currentPhaseParameters;
	ArrayList<ParameterTestEntry> preFlightParameters;
	Aircraft aircraft; 
	
	public FlightTest(){
		aircraft = new Aircraft();
	}
	
	
	public void importFlightTestFile(String filename){
		
	}
	
	public void importOConfigFile(String filename){
				
	}
	
	public void updateFlightParameters(){
		
	}
	
	public void simulateNextFlightPhase(){
				
	}	
	
}
