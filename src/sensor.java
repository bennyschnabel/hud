
public class sensor {
	boolean day;
	int lightSensor;
	int pdcSensor;
	
	String roadSign;
	
	float longitude;
	float latitude;
	
	float[] gpsPosition = {longitude, latitude};
	
	boolean pdc;
	
	public boolean dayTime() {
		if(lightSensor < 120) {
			day = false;
		} else {
			day = true;
		}
		
		return day;
	}
	
	public String getRoadSign() {
		return roadSign;
	}
	
	public float[] getPosition() {
		return gpsPosition;
	}
	
	public boolean parkingSlot() {
		if(pdcSensor < 50) {
			pdc = true;
		} else {
			pdc = false;
		}
		
		return pdc;
	}
}
