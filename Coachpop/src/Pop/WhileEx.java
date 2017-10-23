package Pop;

public class WhileEx {
	public static void main(String[] args) {
		int age = 20;
		while (age > 15) {
			System.out.println("h1");
			age--;
		}

		System.out.println();

		do {
			System.out.println("h1");
		} while (age > 15);
		System.out.println();

		while (true) {

			if (age == 10) {
				break;
			}
			System.out.println("h13");
			age--;
		}
		age = 12;
		while (age > 8) {
			age--;
			if (age == 10) {
				continue;
			}
			System.out.println(age);
		}

	}

}
