package week2.day1;

public class Mobile {

	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		System.out.println("This is my Mobile\n");
		mobile.makeCall();
		mobile.sendMsg();
	}
	
	public void makeCall() {		
		String mobileModel = "Realme C51";
		float mobileWeight = 21.8f;		
		System.out.println("Mobile Model: "+ mobileModel
							+"\nMobile Weight: "+ mobileWeight);		
	}
	
	public void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost = 34000;
		System.out.println("\nIs mobile charged: " + isFullCharged
							+"\nMobile cost: " + mobileCost);		
	}

}
