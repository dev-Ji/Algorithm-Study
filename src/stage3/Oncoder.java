package stage3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Oncoder {
	public static String solution(String[] library, String message) {
		ArrayList<String> exLibrary = new ArrayList<String>();
		ArrayList<String> exMessage = new ArrayList<String>();
		Map<String,String> realMessage = new HashMap<String, String>();

		String answer = "";

		for (int i = 0; i < library.length; i++) {
			exLibrary.add(i, library[i].split(" ")[0]);	// 영어만 add
			exMessage.add(i, library[i].split(" ")[1]);	// 부호만 add
			realMessage.put(exMessage.get(i), exLibrary.get(i));
		}
		
		for (int i = 0; i < message.split(" ").length; i++) {

			if(realMessage.get(message.split(" ")[i])==null) {
				answer += "?";
			}else {
				answer += realMessage.get(message.split(" ")[i]);
			}
		}
		

		
//		for (int j = 0; j < library.length; j++) {
//			check = false;
//			for (int i = 0; i < library.length; i++) {
//				if (message.split(" ")[j].contains(exMessage.get(i)) && check==false) {
//					answer += exLibrary.get(i);
//					check = true;
//				}
//			}
//			if(check == false) {
//				answer += "?";
//			}
//		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] library = { "O ---", "S ..."};
		String message = "... --- ... --.";
		System.out.println(solution(library, message));
	}

}
