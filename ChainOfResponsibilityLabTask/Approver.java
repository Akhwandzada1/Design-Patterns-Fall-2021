package ChainOfResponsibilityLabTask;

public interface Approver {
	public void setNext(Approver approver);
	public void process(Loan loan);
}
