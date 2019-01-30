
public class navigation {
	
	int allowedSpeed;
	
	float longitude;
	float latitude;
	
	float[] gpsPosition = {longitude, latitude};
	
	public int getAllowedSpeed() {
		return allowedSpeed;
	}
	
	public void setNavigationDestination(float longitude, float latitude) {
		gpsPosition[0] = longitude;
		gpsPosition[1] = latitude;
	}
}
