package Pop;

public class OperatorEx {

	public static void main(String[] args) {
		System.out.println(5.1F + 3);
		System.out.println(5.1F - 3);
		System.out.println(5.1F * 3);
		System.out.println(5.1F / 3);
		System.out.println(5.1F % 3);

		// 단항 연산자
		int i = 1;
		i++;
		System.out.println(i);
		i--;
		System.out.println(i);
		boolean b = true;
		System.out.println(b);
		System.out.println(!b);

		// 관계 연산자
		System.out.println("관계연산자");
		System.out.println(3 == 3);
		System.out.println(3 != 3);
		System.out.println(3 > 3);
		System.out.println(3 >= 3);
		System.out.println(3 < 3);
		System.out.println(3 <= 3);

		// 조건 연산자(논리연산자)
		System.out.println("조건연산자 &&");
		System.out.println(true && true);
		System.out.println(false && false);
		System.out.println(true && false);
		System.out.println(false && true);

		// 조건 연산자(논리연산자)
		System.out.println("조건연산자 ||");
		System.out.println(true || true);
		System.out.println(false || false);
		System.out.println(true || false);
		System.out.println(false || true);

		// 비트연산자
		System.out.println("비트연산자");
		System.out.println(5 & 3);
		System.out.println(5 | 3);
		System.out.println(5 << 3);
		System.out.println(5 >> 3);

	}

}
