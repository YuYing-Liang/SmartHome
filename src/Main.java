import Filters.HighPassFilter;
import Filters.LowPassFilter;

public class Main {

	public static void main(String[] args) {
		final int NUM_ACCELS = 1;
		final int NUM_COMPONENTS = 3;
		final float MAX_ACCEL = Integer.MAX_VALUE;
		final float MIN_ACCEL = 0;
		
		
		//High Pass and Low Pass Filter
		HighPassFilter highPassFilter = new HighPassFilter(MAX_ACCEL);
		LowPassFilter lowPassFilter = new LowPassFilter(MIN_ACCEL);
		
		float[][] accelVals = new float[NUM_ACCELS][NUM_COMPONENTS]; 
		
		for(int i = 0; i < NUM_ACCELS; i++){
			for(int j = 0; j < NUM_COMPONENTS; j++){
				float accel_value = accelVals[i][j];
				if(accel_value > MIN_ACCEL){
					accelVals[i][j] = highPassFilter.filter(accel_value);
				}else{
					accelVals[i][j] = lowPassFilter.filter(accel_value);
				}
			}
		}
		//TODO: Swipe: only x-direction acceleration
		
	}

}
