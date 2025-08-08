package week1.day1;

public class Mobile {
	
	public void makeCall() {
		String mobileModel="oppo f21 s pro ";
		float mobileWeight =0.182f;
		System.out.println("My momile model is "+mobileModel);
		System.out.println("My mobile weight is " + mobileWeight);
	}
	public void sendMsg() {
		boolean isFullcharged= false;
		int mobileCost= 26000;
		System.out.println("Is full charged "+isFullcharged);
		System.out.println("My mobile cos is  "+mobileCost);
		
	}
	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.makeCall();
		m1.sendMsg();
		System.out.println("T"
				+ "his is my mobile");
		
		

	}

}
