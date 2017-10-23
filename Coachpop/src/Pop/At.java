package Pop;

import java.util.Scanner;

public class At {
	public static void main(String[] args) {

		int a;
		int b;

		int r = 1;
		int LCM;

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수입력");
		a = sc.nextInt();

		System.out.print("두번째 수입력");
		b = sc.nextInt();

		int tmp1 = a;
		int tmp2 = b;

		if (a < b) {
			a = tmp1;
			b = tmp2;
		}

		while (r > 0) {
			r = a % b;
			a = b;
			b = r;
		}

		LCM = tmp1 * tmp2 / a;
		System.out.println("최대공약수 :" + a);
		System.out.println("최소공배수 :" + LCM);

	}

}