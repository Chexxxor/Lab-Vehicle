package vehicle;

public class Car extends Vehicle{
	private int power;
	
	public Car(String name, String color, int price, int model, String serial, int speed, int direction){
		super(name, color, price, model, serial, speed, direction);
	}
	public void setAllFields(String name, String color, int price, int model, String serial, int speed, int direction){
		super.setAllFields(name, color, price, model, serial, speed, direction);
		this.power = getPower();
	}
	public int getPower() {
	return power;
	}
	public void setPower(int power){
		this.power = power;
	}
	@Override
	public String toString(){
		return super.toString() + "power: " + getPower();
	}
	@Override
	public void turnLeft(int Degrees){
		direction += Degrees;
	}
	@Override
	public void turnRight(int Degrees){
		direction += Degrees;
	}
}
