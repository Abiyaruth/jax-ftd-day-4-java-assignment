package com.cooksys.butterpillar.model;

public class GrowthModel {
double LengthToWingspan;
double LeavesEatenToWeight;
	// any instance fields should be private

	/*public double getLengthToWingspan() {
		return 0; // to be implemented
	}

	public void setLengthToWingspan(double lengthToWingspan) {
		// to be implemented
	}

	public double getLeavesEatenToWeight() {
		return 0; // to be implemented
	}

	public void setLeavesEatenToWeight(double leavesEatenToWeight) {
		// to be implemented
	}
*/
	public Catterfly butterpillarToCatterfly(Butterpillar butterpillar) {
		return new Catterfly(butterpillar.Length*LengthToWingspan,butterpillar.LeavesEaten*LeavesEatenToWeight);
	}

	public double getLengthToWingspan() {
		return LengthToWingspan;
	}

	public void setLengthToWingspan(double lengthToWingspan) {
		LengthToWingspan = lengthToWingspan;
	}

	public double getLeavesEatenToWeight() {
		return LeavesEatenToWeight;
	}

	public void setLeavesEatenToWeight(double leavesEatenToWeight) {
		LeavesEatenToWeight = leavesEatenToWeight;
	}

	public Butterpillar catterflyToButterpillar(Catterfly catterfly) {
		return new Butterpillar(catterfly.Wingspan/LengthToWingspan, catterfly.Weight/LeavesEatenToWeight);
	}
	public boolean equals(GrowthModel g) {
		if(g.LengthToWingspan==LengthToWingspan){
		
		return false;}else
		// TODO: to be implemented
		return false;
		}
	
	@Override
	public String toString() {
		return null; // TODO: to be implemented
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof GrowthModel) {
			return this.equals((GrowthModel) o);
		} else {
			return false;
		}
	}

}
