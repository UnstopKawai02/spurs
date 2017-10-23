package referenceType;

public class MethodEx {

	public static void main(String[] args) {
		MyClass myClass1 = new MyClass();

		myClass1.setNum(3);

		System.out.println(myClass1.getNum());
		System.out.println(myClass1.getName());
		myClass1.setName("Kim");
		System.out.println(myClass1.getName());

		//System.out.println(myClass1.getClassName());
		//System.out.println(myClass1.getClassName());

		// someMethod();

	}

}
