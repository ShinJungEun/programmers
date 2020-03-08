package 알고리즘문제해설;

// 스티커 모으기(최대값)
public class p6 {

	public static void main(String[] args) {
		// test case
		int[] arr1 = {14, 6, 5, 11, 3, 9, 2, 10};
		int[] arr2 = {1, 3, 2, 5, 4};
		
		System.out.println(solution(arr1));
		System.out.println(solution(arr2));

	}
	
	/*
	 * 원형으로 연결된 스티커에서
	 * 몇 장의 스티커를 뜯어내어
	 * 뜯어낸 스티커에 적힌 숫자의 합이 최대가 되도록 하는 문제.
	 * 스티커를 뜯어내면, 양쪽으로 인접해있는 스티커는
	 * 뜯어낼 수 없다.
	 */
	public static int solution(int sticker[]) {
		int answer;
		int size = sticker.length;
		
		int[] d = new int[size];
		
		if(size == 1)
			return sticker[0];
		else if(size == 2)
			return Math.max(sticker[0], sticker[1]);
		
		// 첫번째 스티커를 떼었을 때(마지막 스티커는 못뗌)
		d[0] = sticker[0];
		d[1] = sticker[0];
		
		for(int i = 2; i < size - 1; i++) {
			d[i] = Math.max(d[i - 2] + sticker[i], d[i - 1]);
		}
		answer = d[size - 2];
		
		// 첫번째 스티커를 안떼었을 때(마지막 스티커 뗄 수 있음)
		d[0] = 0;
		d[1] = sticker[1];
		
		for(int i = 2; i < size; i++) {
			d[i] = Math.max(d[i - 2] + sticker[i], d[i - 1]);
		}
		if(answer < d[size - 1])
			answer = d[size - 1];
		
		return answer;
	}

}
