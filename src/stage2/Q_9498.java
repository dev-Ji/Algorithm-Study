package stage2;

import java.util.Scanner;

/*

	문제
	시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
	
	출력
	시험 성적을 출력한다.
	
	예제 입력 1 
	100
	예제 출력 1 
	A
	
 */
public class Q_9498 {

	public static void main(String[] args) {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		if(a >= 90 && a <= 100) {
			System.out.println("A");
		}else if(a >= 80 && a <= 89) {
			System.out.println("B");
		}else if(a >= 70 && a <= 79) {
			System.out.println("C");
		}else if(a >= 60 && a <= 69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}

}
