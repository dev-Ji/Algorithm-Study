package stage5;
// 문제
// "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 
// 예를 들어, 10번 문제의 점수는 3이 된다.


import java.util.Scanner;

// "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

// OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.

// 출력
// 각 테스트 케이스마다 점수를 출력한다.

// 예제 입력 1 
// 5
// OOXXOXXOOO
// OOXXOOXXOO
// OXOXOXOXOXOXOX
// OOOOOOOOOO
// OOOOXOOOOXOOOOX
// 예제 출력 1 
// 10
// 9
// 7
// 55
// 30
public class Q_8959 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int jum = 0;    // 한문제문제 점수(연속누적점수)
        int score = 0;  // 총점(총누적)
        String [] qus = new String [num];
        for (int i = 0; i < num; i++) {
            qus[i] = sc.next();
        }
        
        for (int i = 0; i < qus.length; i++) {
            jum = 0;    // 한문제문제 점수
            score = 0;  // 총점
            if(qus[i].charAt(0) == 'O'){
                score++;    // 1
                jum++;  // 1
            }
           // System.out.println("첫번째 for 문  jum : " + jum + "    score : " + score);
            for (int j = 1; j < qus[i].length(); j++) {
                if(qus[i].charAt(j) == 'O'){
                    if(qus[i].charAt(j-1) == 'O'){
                        jum++;  // 2 3
                        score+=jum; // 3 6
                        //System.out.println("jum : " + jum + "    score : " + score);
                    }else{
                        jum = 1;
                        score++;
                        //System.out.println("전 문제가 X 일때    jum : " + jum + "    score : " + score);
                    }
                }else{
                    jum = 0;
                    //System.out.println("X 일떄 else     jum : " + jum + "    score : " + score);
                }
            }

            System.out.println(score);
        }
    }
}
