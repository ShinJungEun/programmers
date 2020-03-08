package skill_checks.level1;

import java.util.Scanner;

public class p1 {

	// 소수 구하기 문제(최적의 방법)
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		System.out.println(solution(n));

	}

	/*
	 * 모든 수를 배열에 담아
	 * 각 수의 배수들을 색칠하고
	 * 마지막까지 색칠되어있지 않은 수를
	 * 소수로 취급.
	 * 중간에 색칠되어있는지를 확인하여
	 * 효율성 증가
	 */
	public static int solution(int n) {
		int answer = 0;

		boolean[] arr = new boolean[n + 1];
		for(int i = 0; i < n+1; i++) {
			arr[i] = true;
		}

		for(int i = 2; i <= n; i++) {
			if(!arr[i]) {
				continue;
			}
			for(int j = i * 2; j <= n; j+= i) {
				arr[j] = false;
			}
		}

		for(int i = 2; i < n + 1; i++) {
			if(arr[i]) {
				answer++;
			}
		}

		return answer; 
	}

}
