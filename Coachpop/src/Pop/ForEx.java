package Pop;

public class ForEx {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		System.out.println();

		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}
		System.out.println();

		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				continue;
			}

			System.out.println(i);
		}
		System.out.println();

		int[] array = { 2, 3, 4, 5 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();

		String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Smith", "Jones" } };
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names.length; j++) {
				System.out.println(names[i][j]);
			}

		}
		System.out.println();

		for (String[] innerName : names) {
			for (String name : innerName) {
				System.out.println(name);
			}
		}
		System.out.println();

		int age = 20;
		String str = age > 15 ? "too old" : "too young";
		System.out.println(str);

	}
}
