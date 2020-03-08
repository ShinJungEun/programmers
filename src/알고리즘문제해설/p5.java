package 알고리즘문제해설;

// 땅따먹기 문제
public class p5 {

	public static void main(String[] args) {
		// test case
		int[][] test = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
		
		System.out.println(solution(test));

	}
	
	/*
	 * N행 4열의 땅에 각각 점수가 쓰여있는데,
	 * 1행부터 땅을 밟으면 한 행씩 내려올 때
	 * 4칸 중 한칸씩 밟을 수 있다.
	 * 한 행씩 내려올 때는 같은 열을 연속해서 밟을 수 없다.
	 * 마지막 행까지 모두 내려왔을 때
	 * 얻을 수 있는 점수의 최대값을 구하는 문제
	 */
	public static int solution(int[][] land) {
		
		for(int i = 1; i < land.length; i++) {
			land[i][0] += Math.max(Math.max(land[i - 1][1], land[i - 1][2]), land[i - 1][3]);
			land[i][1] += Math.max(Math.max(land[i - 1][0], land[i - 1][2]), land[i - 1][3]);
			land[i][2] += Math.max(Math.max(land[i - 1][0], land[i - 1][1]), land[i - 1][3]);
			land[i][3] += Math.max(Math.max(land[i - 1][0], land[i - 1][1]), land[i - 1][2]);
		}
		
		int len = land.length - 1;
		int max = Math.max(Math.max(land[len][0], land[len][1]),
				  Math.max(land[len][2], land[len][3]));
	
		return max;
	}

}
