package vehicle;

public class Bicycle extends Vehicle {
	protected int gears;

	public Bicycle(String name, String color, int price, int model, int serial, int speed, int direction, int gears) {
		super(name, color, price, model, serial, speed, direction);
		this.gears = gears;
	}
	
	public void setAllFields(String name, String color, int price, int model, int serial, int speed, int direction, int gears){
		super.setAllFields(name, color, price, model, serial, speed, direction);
		this.gears = gears;
	}	
	public int getGears(){
		return gears;
	}
	public void setGears(int gears){
		this.gears = gears;
	}
	@Override
	public void turnLeft(int degrees) {
		direction -= degrees;
	}
	@Override
	public void turnRight(int degrees) {
		direction += degrees;
	}

	public String toString(){
		return super.toString() + "Gears:\t\t" + gears;
	}
}
