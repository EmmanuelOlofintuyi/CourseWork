package prob1;

public class OrganicCake extends Cake{
	
	public OrganicCake(String cakeMix) {
		super(cakeMix);
	}

	@Override
	public String getLiquid() {
		return "1 ¼ cup milk for the liquid";
	}

	@Override
	public String getOil() {
		return "1/2 cup canola oil for the oil";
	}

	@Override
	public String getEggs() {
		return "2 large eggs for the eggs";
	}

}
