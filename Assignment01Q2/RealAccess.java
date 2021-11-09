package Assignment01Q2;
public class RealAccess implements InternetAccess{
	private String UserName;
	private int age;
	public RealAccess(String UserName,int age){
		this.UserName=UserName;
		this.age=age;
	}
	@Override
	public void grantInternetAccess() {
		// TODO Auto-generated method stub
		if(age<18) {
			System.out.println("Sorry, You are not allowed to access the Internet");
		}
		else
			System.out.println("Internet Access granted to"+UserName);
	}
}
