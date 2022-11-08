package prob1;

public class HighAltitudeClassicYellowCake extends ClassicYellowCake{
	
	public HighAltitudeClassicYellowCake(String cakeMix) {
		super(cakeMix);
	}
	
	public String getCakeMix() {
		String s = super.getCakeMix();
		s += " + 2 tbs flour";
		return s;
	}
	
	public String bake(){
		return "Bake at 375 degrees F 26 minutes";
	}

	
}
