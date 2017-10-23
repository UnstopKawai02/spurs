package Pop;

public class Excercise {
	public static void main(String[] args) {

		// 1번
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();

		// 2번
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 10; j++) {
				if ((j + i) % 2 == 0) {
					System.out.print('#');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}

		// 3-1번
		for (int i = 8; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();

		// 3-2번
		for (int i = 8; i >= 1; i--) {
			for (int j = 8; j >= i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		// 3-3번
		for (int i = 7; i >= 0; i--) {
			for (int k = 0; k < (7 - i); k++) {
				System.out.print("  ");
			}
			for (int j = 0; j < (i * 2 + 1); j++) {
				if (j % 2 == 0) {
					System.out.print('#');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}

		// 3-4번

		for (int i = 0; i < 8; i++) {
			for (int k = 0; k < (7 - i) * 2; k++) {
				System.out.print(' ');
			}
			for (int j = 0; j < (i * 2 + 1); j++) {
				if (j % 2 == 0) {
					System.out.print('#');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}

	}
}
