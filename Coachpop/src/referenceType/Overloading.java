package referenceType;

public class Overloading {

	public static void main(String[] args) {
		MyClass2 myObject = new MyClass2();

		myObject.print(10);
		myObject.print("Antetokounmpo");
	    myObject.print('c');
		myObject.print(10, 11);
		myObject.print(1,2,3);
		
		int sum = myObject.sum(1,2,3,4,5);
		
		System.out.println(sum);

	}

}
