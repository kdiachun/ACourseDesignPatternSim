package sim;

import java.util.ArrayList;

public class Aircraft {
	
	private ArrayList<Product> products = new ArrayList<Product>();;
	
	public void simulate(){
		boolean hasChange = false;
		//do this loop until there are no changes in the product
		while(!hasChange){
			hasChange = false;
			//go through each product and update all of thier attributes
			for(Product prod : products){  //ITERATORRRRRRRRRRR
				prod.updateAttributes();
				//if this product has a change mark it so
				if(!hasChange && prod.hasChange()){
					hasChange = true;
				}
			}
		}
	}
	
	public void addProduct(Product prod){
		products.add(prod);
	}
	
	
}
