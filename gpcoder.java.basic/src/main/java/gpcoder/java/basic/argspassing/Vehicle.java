package gpcoder.java.basic.argspassing;

public class Vehicle {
	private String name;
	private int speed;

	public Vehicle(String name, int speed) {
		super();
		this.name = name;
		this.speed = speed;
	}

	public Vehicle() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", speed=" + speed + "]";
	}
}
