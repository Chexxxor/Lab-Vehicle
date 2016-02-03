package vehicle;

import java.util.Formatter;

public abstract class Vehicle {
	protected String color;
	protected int model;
	protected String name;
	protected int price;
	protected int serial;
	protected int speed;
	protected int direction;
	
	public Vehicle(String color, int model, String name, int price, int serial, int speed, int direction){
		setAllFields(color, model, name, price, serial, speed, direction);
	}
	
	public void setAllFields(String color, int model, String name, int price, int serial, int speed, int direction){
		this.color = color;
		this.model = model;
		this.name = name;
		this.price = price;
		this.serial = serial;
		this.speed = speed;
		this.direction = direction;
	}
	
	public String toString(){
		Formatter f = new Formatter();
		String retString = f.format("%s:\n"
				+ "Serial Number:\t%d\n"
				+ "Model:\t\t%d\n"
				+ "Color:\t\t%s\n"
				+ "Price:\t\t$%d\n\n"
				+ "Speed:\t\t%d mph"
				+ "Direction\t\t%d degrees", name, serial, model, color).toString();
		f.close();
		return retString;
	}
	
	public abstract void turnLeft(int degrees);
	public abstract void turnRight(int degrees);

}
