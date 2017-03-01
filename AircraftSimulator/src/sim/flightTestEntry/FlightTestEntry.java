package sim.flightTestEntry;

import sim.enums.EntryTypes;

public class FlightTestEntry {

	private EntryTypes entryType;
	
	public FlightTestEntry(EntryTypes type){
		entryType = type;
	}

	public EntryTypes getEntryType() {
		return entryType;
	}
	
	public void setEntryType(EntryTypes entryType) {
		this.entryType = entryType;
	}
	
	@Override
	public String toString(){
		return entryType.name();
	}
}
