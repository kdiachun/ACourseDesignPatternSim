package sim.flightTestEntry;

import sim.enums.EntryTypes;

public class DescriptiveTestEntry extends FlightTestEntry {

	private String description;
	
	public DescriptiveTestEntry(EntryTypes type, String desc){
		super(type);
		description = desc;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
