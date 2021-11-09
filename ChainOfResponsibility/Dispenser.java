package ChainOfResponsibility;

public interface Dispenser {
	void setNext(Dispenser next);
	void dispense(Currency amount);
}
