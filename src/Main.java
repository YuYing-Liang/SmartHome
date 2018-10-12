public class Main {

	public static void main(String[] args) {
		final int NUM_ACCELS = 1;
		final int NUM_COMPONENTS = 3;
		final float MAX_ACCEL = Integer.MAX_VALUE;
		final float MIN_ACCEL = 0;
		
		
		//Filter
		
		float[][] accelVals = new float[NUM_ACCELS][NUM_COMPONENTS]; 
		
		for(int i = 0; i < NUM_ACCELS; i++){
			for(int j = 0; j < NUM_COMPONENTS; j++){
				
				if(accelVals[i][j] > MAX_ACCEL){
					accelVals[i][j] = MAX_ACCEL;
				}
				
				if(accelVals[i][j] < MIN_ACCEL){
					accelVals[i][j] = MIN_ACCEL;
				}
			}
		}
		
		
		
		
		//TODO: Swipe: only x-direction acceleration
		
	}

}
