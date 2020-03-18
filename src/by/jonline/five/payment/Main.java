package by.jonline.five.payment;

public class Main {

	public static void main(String[] args) {
		Product airPods = new Product("наушники AirPods", 190);
		Product cabelUsb = new Product("USB кабель", 20);
		Product cabelLightning = new Product("Lightning кабель", 15.23);
		Product tvSamsung = new Product("Телевизор Samsung", 690);
		Product tvHorizont = new Product("Телевизор Горизонт", 570);

		Payment one = new Payment();
		one.add(tvHorizont, 1);
		one.add(airPods, 2);
		one.add(cabelUsb, 4);
		one.add(cabelLightning, 1);
		one.add(tvSamsung, 1);
		
		Printer.print(one);
	}
}