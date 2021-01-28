package stage3;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 A+B를 출력한다.

예제 입력1 
5
1 1
2 3
3 4
9 8
5 2
예제 출력 1 
2
5
7
17
7
 */
public class Q_10950 {

	public static void main(String[] args) {
		ArrayList<Integer> sum = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt(); // 받을 갯수

		for (int i = 0; i < cnt * 2; i++) {
			sum.add(sc.nextInt());
		}

		for (int i = 0; i < cnt * 2; i += 2) {
			System.out.println(sum.get(i) + sum.get(i + 1));
		}

	}

}
