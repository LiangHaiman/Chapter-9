
public class TestCircleWithPrivateDataFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 myCircle = new Circle2(5.0);
		System.out.println("The area of the circle of radius "
					+ myCircle.getArea() + " is " + myCircle.getArea());
		myCircle.setRadius(myCircle.getArea() * 1.1);
		System.out.println("The area of the circle of radius "
				+ myCircle.getArea() + " is " + myCircle.getArea());
		System.out.println("The number of objects created is "+
				 Circle2.getNumberOfObjects());
	}
	

}
