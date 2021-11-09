package ChainOfResponsibilityLabTask;

public abstract class BaseApprover implements Approver {
	
	public BaseApprover() {
		
	}

	@Override
	public void setNext(Approver approver) {
		
		
	}

	@Override
	public abstract void process(Loan loan);

}
