package sim.flightTestEntry;

import sim.enums.EntryTypes;

public class ParameterTestEntry extends FlightTestEntry {

	private String parameter;
	private double value;
	
	public ParameterTestEntry(EntryTypes type, String param, double val){
		super(type);
		parameter = param;
		value = val;
	}
	
	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	
}
