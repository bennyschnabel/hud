
public class interfaces {
	
	boolean day;
	
	String[] layout = new String[5];
	
	int brightness;
	
	boolean parking;
	boolean navigation;
	
	public interfaces() {
		sensor sensor = new sensor();
		day = sensor.dayTime();
	}
	
	public String[] changeLayout() {
		int i = 0;
		if(parking = true) {
			i = 1;
		} else if(navigation = true) {
			i = 2;
		} //....
		
		//String Layout = layout[i];
		layout[0] = Integer.toString(changeToNightMode());
		layout[1] = Integer.toString(i);
		return layout;
	}
	
	public int changeToNightMode() {
		if(day = true) {
			brightness = brightness + 50;
		} else {
			brightness = brightness - 50;
		}
		
		return brightness;
	}
}
