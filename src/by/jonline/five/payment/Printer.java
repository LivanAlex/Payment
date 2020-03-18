package by.jonline.five.payment;

public abstract class Printer {

	public static void print(Payment payment) {
		System.out.println("*********************************");
		System.out.println();
		System.out.println("       ООО \"Рога и копыта\"       ");
		System.out.println();
		System.out.println("*********************************"); //29
		System.out.println();
		System.out.println("оператор: Людмила");
		System.out.println("чек №404");
		System.out.println();
		
		for (Field field : payment.getFields()) {
			String name = field.getProduct().getName();
			
			int amount = field.getAmount();
			int price = field.getPrice();
			
			int rubl = price / 100;
			int kop = price % 100;
			
			
			System.out.printf("%-22s %2d %4d,%02d\n", name, amount, rubl, kop);
		}
		
		int sum = payment.getSum();
		int rubl = sum / 100;
		int kop = sum % 100;
		
		System.out.println();
		System.out.printf("%23s %6d,%02d\n", "Итого:", rubl, kop);
		
		System.out.println();
		System.out.println("*********************************");
		System.out.println();
		System.out.println(" скидка 2% на беруши для ушей от\n   компании проктер энд гэмбл       ");
		System.out.println();
		System.out.println("*********************************");
	}
}
