package test2;

import java.util.Scanner;

public class Bluemoon2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] str = new String[5];
        String temp;
        int i,j;
 
        for(i=0;i<5;i++)
            str[i] = sc.next();
        
        for(i=0;i<4;i++){
            for(j=i+1;j<5;j++){
                //compareTo함수 a<b이면 음수를 반환(a=b이면 0을 그대로 반환)-> 아스키코드  3 2 1  순이라고 하면 3-2하면 1양수가 나와서 
                    //역순이 안될텐데 양수나오면 순서가 역순 상태 임이 맞지만 아래와 같이 <0 이면 음수가 나온것이기 때문에 역순 취해준다.
                    //string배열(char형과 같은 의미)이 알아서 숫자(아스키코드)와 비교하면서 하기 떄문에 굳이 형변환 할 필요가 없다. 
                if(str[i].compareTo(str[j])<0){
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        for(i=0;i<5;i++)
        System.out.println(str[i]);
    }

}
