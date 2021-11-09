package Assignment01Q2;
public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String UserName="Hamid Shaukat Amin";
		int age=21;
		ProxyAccess access=new ProxyAccess(UserName,age);
		access.grantInternetAccess();
	}

}
