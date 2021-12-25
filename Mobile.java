package week1.day1;

public class Mobile {
	String mobileModel ="Samsung";
	int mobileWeight = 100;
	boolean isFullCharge = true;
	double mobileCost = 17000.89;
	
	
	public void makeCall() {
	System.out.println("Make a call to Amudhini");	
	}
	
	public void sendMsg() {
	System.out.println("Send msg to Amudhini");
	}
	public static void main(String[] args) {
		Mobile object = new Mobile();
		object.makeCall();
		object.sendMsg();
		
		System.out.println(object.mobileModel);
		System.out.println(object.mobileWeight);
		System.out.println(object.isFullCharge);
		System.out.println(object.mobileCost);
		
	}

}
