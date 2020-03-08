package 알고리즘문제해설;

import java.util.Scanner;

// 자연수 n의 각 자릿수 합 구하기
public class p1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		System.out.println(solution(n));

	}
	
    public static int solution(int n) {
        int answer = 0;
       
        while(n != 0) {
            answer += n % 10;
            n /= 10;
        }
        
        return answer;
    }

}
