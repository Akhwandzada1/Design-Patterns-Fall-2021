package ChainOfResponsibility;
public class Demo {
	public static void main(String[] args) {
		Chain chain=new Chain();
		Currency currency=new Currency(5500);
		chain.dispense(currency);
	}
}