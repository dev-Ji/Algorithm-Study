package stage3;


public class Enplant1 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      // 매일아침 센터에도착하는 냉장고의 수에대한 기록을 고려할때
      // 모든냉장고를 수리하기위해 며칠을 일해야하는지 계산
      
      //6,5,4,3,2,1,0,0,1,2,3,4,5,6
      //10,0,0,4,20
      int [] arr = {10,0,0,4,20}; // 하루마다 들어온 수리필요 냉장고수 배열
      int num = 8; // 하루에 최대 고칠수있는 냉장고수
      
      System.out.println(solution(arr, num));
   }

   public static int solution(int[] arr, int num) {
      
      int day = 0;
      
      for(int i=0; i<arr.length; i++) {
         day += arr[i];
      }
      
      int cnt = 0;
      if(arr.length > num)
         cnt = arr.length - num;
      else
         cnt = num - arr.length;
      
      day = day / num;
      day += cnt;      
      
      return day;
   }
   
}
