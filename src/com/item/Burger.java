package com.item;
import com.packing.Packing;
import com.packing.Wrapper;

public abstract class Burger implements Item {
	@Override
	public Packing packing() {

		return new Wrapper();
	}
	
	@Override
	public abstract float price();

}
