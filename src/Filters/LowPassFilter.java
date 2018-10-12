package Filters;

public class LowPassFilter {

	float minVal;

	public LowPassFilter(float minVal) {
		this.minVal = minVal;
	}
	
	public float filter(float val){
		if(val < this.minVal){
			return this.minVal;
		}else{
			return val;
		}
	}
	
}
