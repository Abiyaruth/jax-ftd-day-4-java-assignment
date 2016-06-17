package com.cooksys.butterpillar.model;


public class Butterpillar {
	 double Length;
	 double LeavesEaten;
	public Butterpillar()
	{
	}
	public Butterpillar(double Length,double LeavesEaten)
	{
		this.Length=Length;
		this.LeavesEaten=LeavesEaten;
	}
	public  double getLength() {
		return Length;
	}
	public  void setLength(double Length) {
		this.Length = Length;
	}
	public  double getLeavesEaten() {
		return LeavesEaten;
	}
	public  void setLeavesEaten(double LeavesEaten) {
		this.LeavesEaten = LeavesEaten;
	}
	@Override
	public String toString() {
		return "Butterpillar [length:" +Length+ ",leavesEaten: "+LeavesEaten+ "]";
	}
	public boolean equals(Butterpillar b){
	if(b.Length!=Length)
	{
		return false;
	}else {
		return true;
	}
	}
	@Override
	public boolean equals(Object o) {
		if (o instanceof Butterpillar) {
			return this.equals((Butterpillar) o);
		} else {
			return false;
		}
	}
	
	

}
