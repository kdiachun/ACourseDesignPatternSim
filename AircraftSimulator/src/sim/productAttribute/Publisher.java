package sim.productAttribute;

import java.util.ArrayList;

import sim.enums.AttributeType;
import sim.enums.SupportedOperation;

public class Publisher implements IProductAttribute {
	
	String name;
	AttributeType type;
	int max;
	int min;
	int default_val;
	int value;
	SupportedOperation op;
	ArrayList<Subscriber> operands;
	
	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}

}
