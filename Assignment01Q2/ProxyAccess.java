package Assignment01Q2;

public class ProxyAccess implements InternetAccess {
	private String UserName;
	private int age;
	RealAccess access;
	public ProxyAccess(String UserName,int age) {
		this.UserName=UserName;
		this.age=age;
	}
	@Override
	public void grantInternetAccess(){
		access=new RealAccess(UserName,age);
		}
		
	}

