
public class controlUnit {
	
	int currentSpeed;
	int allowedSpeed;

	float longitude;
	float latitude;
	
	float[] gpsPosition = {longitude, latitude};
	
	String nextNavigationInstruction;
	
	public void getCurrentSpeed() {
		car car = new car();
		currentSpeed = car.currentSpeed();
	}
	
	public void getAllowedSpeed() {
		navigation navigation = new navigation();
		allowedSpeed = navigation.allowedSpeed();
	}
	
	public void speedWithinTolerance() {
		if(currentSpeed > allowedSpeed) {
			System.out.println("Reduce speed");
		} else {
			System.out.println("Speed ok!");
		}
	}
	
	public float[] getPositionOnMap() {
		return gpsPosition;
	}
	
	public String getNextNavigationInstruction() {
		return nextNavigationInstruction;
	}

}
