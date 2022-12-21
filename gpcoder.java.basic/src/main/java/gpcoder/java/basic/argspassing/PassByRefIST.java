package gpcoder.java.basic.argspassing;

public class PassByRefIST {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("Volvo", 200);
		System.out.println("Before change: " + vehicle + ", hashcode: " + vehicle.hashCode());
		useNitro(vehicle);
		System.out.println("After change: " + vehicle + ", hashcode: " + vehicle.hashCode());
	}

	public static double useNitro(Vehicle vehicle) {
		vehicle.setSpeed((int) (vehicle.getSpeed() * (1 + Math.random())));
		return vehicle.getSpeed();
	}
}
