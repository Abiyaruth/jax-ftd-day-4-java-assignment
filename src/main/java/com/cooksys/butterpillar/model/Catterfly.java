package com.cooksys.butterpillar.model;


public class Catterfly {
	 double Wingspan;
	 double Weight;
	public Catterfly()
	{
		
	}
	public Catterfly(double Wingspan,double Weight)
	{
		this.Wingspan = Wingspan;
		this.Weight=Weight;
	}
	
	
	public  double getWingspan() {
		return Wingspan;
	}
	public  void setWingspan(double Wingspan) {
		this.Wingspan = Wingspan;
	}
	public  double getWeight() {
		return Weight;
	}
	public  void setWeight(double Weight) {
		this.Weight = Weight;
	}


	@Override
	public String toString() {
		return "Catterfly [wingspan: " + Wingspan + ", weight: " +Weight + "]";
	}
	public boolean equals(Catterfly c){
		if(c.Wingspan!=Wingspan)
		{
			return false;
		}else {
			return true;
		}
		}
	@Override
	public boolean equals(Object o) {
		if (o instanceof Catterfly) {
			return this.equals((Catterfly) o);
		} else {
			return false;
		}
	}

}
