package by.jonline.five.payment;

import java.util.ArrayList;

public class Payment {
	
	private ArrayList<Field> fields;
	private int sum;
	
	public Payment() {
		fields = new ArrayList<>();
	}
	
	public void add(Product product, int amount) {
		Field f = new Field(product, amount);
		sum += f.getPrice();
		fields.add(f);
	}

	public ArrayList<Field> getFields() {
		return fields;
	}

	public int getSum() {
		return sum;
	}
}

class Field {
	private Product product;
	private int amount;
	private int price;
	
	public Field(Product product, int amount) {
		this.product = product;
		this.amount = amount;
		price = product.getPrice() * amount;
	}

	public Product getProduct() {
		return product;
	}

	public int getAmount() {
		return amount;
	}
	
	public int getPrice() {
		return price;
	}
}
