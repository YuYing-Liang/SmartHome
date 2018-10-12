package Filters;

public class HighPassFilter {
	
	float maxVal;
	
	public HighPassFilter(float maxVal){
		this.maxVal = maxVal;
	}
	
	public float filter(float val){
		if(val > this.maxVal){
			return this.maxVal;
		}else{
			return val;
		}
	}
}
