package autowiredAnnotationwithxml;

public class Engine {

	private String model;
	private String horsepower;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(String horsepower) {
		this.horsepower = horsepower;
	}
	@Override
	public String toString() {
		return "Engine [model=" + model + ", horsepower=" + horsepower + "]";
	}

	
}
