package 알고리즘문제해설;

// 직사각형의 나머지 한 점 좌표를 구하는 문제
public class p3 {
	
	public static void main(String[] args) {
		
		// test case
		int[][] arr1 = {{1,4}, {3,4}, {3,10}};
		int[][] arr2 = {{1,1}, {2,2}, {1,2}};

		int[] ans;
		ans = solution(arr1);
		System.out.println(ans[0] + ", " + ans[1]);

		ans = solution(arr2);
		System.out.println(ans[0] + ", " + ans[1]);

	}

	/*
	 * 직사각형의 4개의 점 중
	 * 3개의 좌표가 주어질 때,
	 * 나머지 한 점의 좌표를 구하기
	 */
	public static int[] solution(int[][] v) {
		int x;
		int y;

		if(v[0][0]==v[1][0]){
			x=v[2][0];
		}else if(v[0][0]==v[2][0]){
			x=v[1][0];
		}else{
			x=v[0][0];
		}

		if(v[0][1]==v[1][1]){
			y=v[2][1];
		}else if(v[0][1]==v[2][1]){
			y=v[1][1];
		}else{
			y=v[0][1];
		}

		int[] answer = {x, y};

		return answer;
	}

}
