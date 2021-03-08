
public class Main {

	public static void main(String[] args) {
		
		int[] num = new int[100]; //20의 방이 있는 배열 생성
		
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;
		} //배열에 방에 각각 숫자를 넣음
		
		for(int sniffling:num) {
			if(sniffling%2 != 0) { //홀수
				System.out.println("홀 : " + sniffling);
			} else { //짝수
				System.out.println("짝 : " + sniffling);
			}
		}		
	}
}
