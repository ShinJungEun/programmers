package 알고리즘문제해설;

import java.util.Arrays;
import java.util.Scanner;

// int 배열의 순열 검사
public class p2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.nextLine();
		
		String strArr[] = str.split(" ");
		
		int arr[] = new int[strArr.length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		
		System.out.println(solution(arr));
	}
	
	/*
	 * 길이가 n인 배열에
	 * 1부터 n까지 숫자가
	 * 중복 없이 한 번씩 들어있는지를 확인
	 */
    public static boolean solution(int[] arr) {
        boolean answer = true;

        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1) {
                answer = false;
                break;
            }
        }

        return answer;
    }

}
