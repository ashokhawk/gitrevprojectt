package ac;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name="ac_details")
	
	public class Ac {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private  String color;
	private  int price;
	private int discount;
	private int netPrice;


	public int getId() {
	return id;
	}
	
	public void setId(int id) {
	this.id = id;
	}
	
	private String brand;
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getDiscount() {
		return discount;
	}
	
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	public int getNetPrice() {
		return netPrice;
	}
	
	public void setNetPrice(int netPrice) {
		this.netPrice = netPrice;
	}

}
