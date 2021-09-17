package oops_Constructor;

public class DefaultConstructor {
	
	String trainName;
	int    trainNumber;

	public static void main(String[] args) {
		DefaultConstructor obj = new DefaultConstructor();
		
		System.out.println("Train name and number is :" +obj.trainName+ " "+obj.trainNumber);

	}
	
	public DefaultConstructor() {  //Default Constructor i.e. we are not declaring variable inside brackets()
		
		this.trainName = "TrainA";
		this.trainNumber = 23;
		
	}
	


}
