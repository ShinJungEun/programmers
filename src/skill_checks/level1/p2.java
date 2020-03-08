package skill_checks.level1;

import java.util.Scanner;

public class p2 {

	// 문자열의 중간 문자를 출력하는 문제
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		
		System.out.println(solution(str));
	}
	
	 public static String solution(String s) {
	      String answer = "";
	      
	      String[] arr = s.split("");
	      int mid = arr.length / 2;
	      if(arr.length % 2 == 0) {
	          answer = arr[mid - 1] + arr[mid];
	      }
	      else {
	          answer = arr[mid];
	      }
	      
	      return answer;
	  }

}
