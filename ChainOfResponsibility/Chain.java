package ChainOfResponsibility;

public class Chain{
	Dispenser start;
	public Chain() {
		Dispenser Rs5000=new RupeesDispenser(5000);
		Dispenser Rs1000=new RupeesDispenser(1000);
		Dispenser Rs500=new RupeesDispenser(500);
		
		start=Rs5000;
		start.setNext(Rs1000);
		Rs1000.setNext(Rs500);
	}
	public void dispense(Currency currency) {
		if(currency.getAmount()%500==0)
		start.dispense(currency);
		else
			System.out.println("The amount "+currency.getAmount()+" is not a multiple of 500");
	}
}
