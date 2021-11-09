package LabAssignment02Q01PrototypePattern;

public class CheeseCake implements Cake {
	
	private String sugar;
	private String butter;
	private String cheese;
	private String name;
	
	public CheeseCake() {
		
	}
	@Override
	public Cake prepareCake() {
		Cake cake = null;
		try {
			cake = (Cake) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cake;
	}
	
	public void addSugar(String sugar) {
		this.sugar=sugar;
	}
	public void addButter(String butter) {
		this.butter=butter;
	}
	public void addCheese(String cheese) {
		this.cheese=cheese;
	}
	public void setName(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "CheeseCake [sugar=" + sugar + ", butter=" + butter + ", cheese=" + cheese + ", name=" + name + "]";
	}
	
}
