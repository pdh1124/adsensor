package generic;

public class S03이차원배열 { //이차원 배열
	public static void main(String[] args) {
		
		double score[][] = { { 3.3, 3.4 }, // 1학년 1, 2학기 평점
				{ 3.5, 3.6 }, // 2학년 1, 2학기 평점
				{ 3.7, 4.0 }, // 3학년 1, 2학기 평점
				{ 4.1, 4.2 } }; // 4학년 1, 2학기 평점
		
		double sum = 0;
		
		for (int y = 0; y < score.length; y++) { // 각 학년별로 반복 (행열 중 행 부분)
			for (int term = 0; term < score[y].length; term++) { // 각학년의 학기별로 반복 (행열 중 열 부분)
				sum += score[y][term]; // 전체 평점 합
			}
		}
		int n = score.length; // 배열의 행 개수, 4
		int m = score[0].length; // 배열의 열 개수, 2
		System.out.println("4년 전체 평점 평균은 " + sum / (n * m));
	}
}
