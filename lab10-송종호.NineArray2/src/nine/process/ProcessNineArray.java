package nine.process;

import java.util.Set;

public class ProcessNineArray {
	
	public Set test(Set set) {
		return set;
	}

	public void test2(int number) {
		int totalCount = number;

		System.out.println(number);
	}

	public void Calculation(String name) {
		// 입력된 값에 따라 메소드를 불러오는 case 문
		switch (name) {
		case "대각선":
			diagonal();
			break;
		case "가로":
			row();
			break;
		case "세로":
			column();
			break;
		}
	}

	/**
	 * 가로로 출력을 하는 매소드
	 */
	public void row() {
		for (int x = 1; x < 10; x++) {
			for (int y = 1; y < 10; y++) {
				System.out.printf("%2d x %2d = %3d \t\t", x, y, x * y);
			}
			System.out.println();
		}
	}

	/**
	 * 새로로 출려을 하는 매소드
	 */
	public void column() {
		for (int x = 1; x < 10; x++) {
			for (int y = 1; y < 10; y++) {
				System.out.printf("%2d x %2d = %3d\t\t", y, x, x * y);
			}
			System.out.println();
		}
	}

	/**
	 * case에서 대각선을 선택으로 출력하는 메소드
	 */
	public void diagonal() {
		int count = 0;

		for (int x = 1; x < 10; x++) {
			for (int y = 1; y < 10; y++) {
				// 첫번째 값은 탭을 넣지 않겠다
				if (x != 1) {
					// 앞 간격을 만드는 반복문
					while (count < x - 1) {
						System.out.printf("\t\t");
						count++;
					}
				}

				System.out.printf("%2d x %2d = %3d", x, y, x * y);
				System.out.println();
				count = 0;

			}
		}

	}

}
