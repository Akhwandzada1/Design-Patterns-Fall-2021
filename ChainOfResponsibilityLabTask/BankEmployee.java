package ChainOfResponsibilityLabTask;

public class BankEmployee extends BaseApprover {
	
	private String title;
	private int ApprovalLimit;
	
	public BankEmployee(String title, int ApprovalLimit) {
		this.title=title;
		this.ApprovalLimit=ApprovalLimit;
	}
	@Override
	public void process(Loan loan){
		
	}

}
