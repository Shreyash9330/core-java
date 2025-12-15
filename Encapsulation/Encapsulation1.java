package oopsConcept;

class Car
{
	private String brand;
	private int Model;
	private float price;
	
	public String getBrand()
	{
		return brand;
	}
	
	public void setBrand(String  brand)
	{
		this.brand = brand;
	}
	
	public int getModel()
	{
		return Model;
	}
	
	public void setModel(int model)
	{
		this.Model = Model;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	public void setPrice(float price)
	{
		this.price = price;
	}
	
}


public class Encapsulation1 {

	public static void main(String[] args) {
		Car c = new Car();
		c.setBrand("BMW");
		c.setPrice(550000.00f);
		c.setModel(2025);
		
		System.out.println("Brand Name Of car :"+c.getBrand());
		System.out.println("Price of the Car :"+c.getPrice());
		System.out.println("Model of The Car :"+c.getModel());
	}

}
