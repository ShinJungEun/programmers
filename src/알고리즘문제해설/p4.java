package 알고리즘문제해설;

// 가장 큰 정사각형을 찾는 문제
public class p4 {

	public static void main(String[] args) {
		// test case
		int[][] arr1 = {{0,1,1,1}, {1,1,1,1},{1,1,1,1}, {0,0,1,0}};
		int[][] arr2 = {{0,0,1,1}, {1,1,1,1}};

		System.out.println(solution(arr1));
		System.out.println(solution(arr2));
	}

	/*
	 * 1과 0으로 채워진 표에서
	 * 1로 이루어진 가장 큰 정사각형의
	 * 넓이를 구하는 문제
	 */
	public static int solution(int [][]board)
	{
		int answer = 0;

		if(board.length == 1) {
			for(int i = 0; i < board[0].length; i++) {
				if(board[0][i] == 1)
					return 1;
			}
		}
		else if(board[0].length == 1) {
			for(int i = 0; i < board.length; i++) {
				if(board[i][0] == 1)
					return 1;
			}
		}

		for(int i = 1; i < board.length; i++) {
			for(int j = 1; j < board[0].length; j++) {
				if(board[i][j] >= 1) {
					board[i][j] = Math.min(Math.min(board[i - 1][j - 1], board[i - 1][j]), board[i][j - 1]) + 1;
					answer = Math.max(board[i][j], answer);          
				}
			}
		}

		return answer * answer;
	}

}
