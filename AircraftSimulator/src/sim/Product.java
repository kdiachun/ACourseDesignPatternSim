package sim;

import java.util.ArrayList;

import sim.productAttribute.IProductAttribute;

public class Product {
	private int productID;
	private boolean hasChange;
	private ArrayList<IProductAttribute> attributes;
	
	public Product(int id){
		productID = id;
		attributes = new ArrayList<IProductAttribute>();
	}
	
	public boolean updateAttributes(){
		hasChange = false;
		boolean attrChanged = false;
		for(IProductAttribute attr : attributes){ //ITERATOORRRRRRRRRR
			attrChanged = attr.update();
			if(!hasChange && attrChanged){
				hasChange = true;
			}
		}
		return hasChange;
	}
	
	public int getProductID(){
		return productID;
	}
	
	public boolean hasChange(){
		return hasChange;
	}
	
	public void addAttribute(IProductAttribute attr){
		attributes.add(attr);
	}
	
}
