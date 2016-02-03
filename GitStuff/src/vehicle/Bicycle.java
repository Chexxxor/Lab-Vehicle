package vehicle;

public class Bicycle extends Vehicle {
	protected int gears;

	public Bicycle(String color, int model, String name, int price, int serial, int speed, int direction, int gears) {
		super(color, model, name, price, serial, speed, direction);
		this.gears = gears;
	}
	
	public void setAllFields(String color, int model, String name, int price, int serial, int speed, int direction, int gears){
		super.setAllFields(color, model, name, price, serial, speed, direction);
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
