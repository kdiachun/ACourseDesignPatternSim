package sim.productAttribute;

import sim.enums.AttributeType;

public class Subscriber implements IProductAttribute {

	String name;
	AttributeType type;
	int max;
	int min;
	int default_val;
	int value;
	int origin;
	
	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}

}
