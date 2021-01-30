package stage3;

import java.util.ArrayList;

public class Enplant2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      // 매일아침 센터에도착하는 냉장고의 수에대한 기록을 고려할때
      // 모든냉장고를 수리하기위해 며칠을 일해야하는지 계산
      
      //6,5,4,3,2,1,0,0,1,2,3,4,5,6
      //10,0,0,4,20
      int [] arr = {6,5,4,3,2,1,0,0,1,2,3,4,5,6}; // 하루마다 들어온 수리필요 냉장고수 배열
      int num = 3; // 하루에 최대 고칠수있는 냉장고수
      
      System.out.println("답답답"+solution(arr, num));
   }

   public static int solution(int[] arr, int num) {
      int ex=0;
      int daycnt = 0;
      ArrayList<Integer> arr2 = new ArrayList<Integer>();
      
      for (int i = 0; i < arr.length; i++) {
		arr2.add(arr[i]);
	}

 	 
     for (int i = 0; i <arr.length; i++) {
		if(arr[i]/num >= 1) {
			if(i != arr.length-1) {
				daycnt+= arr[i]/num;
				System.out.println(daycnt + "  daycnt");
				arr[i+1] = arr[i+1] + arr[i]%num;
				System.out.println("arr[" +i + "] : "+arr[i] + " arr[" +(i+1) + "] : " + arr[i+1]);
			}
		}
//		else if(arr[i] > 0) {
//			
//			if(arr[i]/num >= 1) {
//				daycnt+= arr[i]/num;
//				arr[i+1] = arr[i+1] + arr[i]%num;
//			}
//			System.out.println("arr[" +i + "] : "+arr[i] + " arr[" +(i+1) + "] : " + arr[i+1]);
//		}
	}
     

     if(arr[arr.length-1] % num != 0) {
         if(arr[arr.length-1] % num > 0) {
        	 daycnt += (arr[arr.length-1]/num) +1;
         }else if(arr[arr.length-1] % num == 0) {
        	 daycnt += arr[arr.length-1]/num;
         }
     }else {
    	 daycnt += arr[arr.length-1] / num;
     }

     
     return daycnt;
   }
   
}
