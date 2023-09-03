package equals.methdos.override;

public class Car {
	String brand;
	String model;
	String color;
	Integer engineSize;

	public Car() {
	}

	public Car(String brand, String model, String color, Integer engineSize) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.engineSize = engineSize;
	}

	@Override
	public boolean equals(Object obj) {
		Car c = (Car) obj;

		if (c.getBrand().equals(this.getBrand()) && c.getColor().equals(this.getColor())
				&& c.getEngineSize().equals(this.getEngineSize()) && c.getModel().equals(this.getModel())) {
			return true;

		}

		return false;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(Integer engineSize) {
		this.engineSize = engineSize;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", color=" + color + ", engineSize=" + engineSize + "]";
	}

}
