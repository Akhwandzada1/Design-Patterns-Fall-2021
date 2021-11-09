package ChainOfResponsibilityLabTask;

public class Demo{

	public static void main(String[] args){
		
		BankEmployee clerk=new BankEmployee("Clerk",10000);
		BankEmployee assistantManager=new BankEmployee("Assistant Manager", 25000);
		BankEmployee manager=new BankEmployee("Manager",10000);
		clerk.setNext(assistantManager);
		assistantManager.setNext(manager);
		Loan loan=new Loan("5",3000,"House Repair");
		clerk.process(loan);
		loan=new Loan("9",30000,"Car Damage");
		clerk.process(loan);

	}

}
