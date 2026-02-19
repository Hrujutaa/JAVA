package constructors;

public class Car {
	private int modelNo;
	private String carname;
	private String carColor;
	public Car(){
		System.out.println("Inside default constructor");
		modelNo=1;
		carname="name not available";
		carColor="NA";
	}
	
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	

}
