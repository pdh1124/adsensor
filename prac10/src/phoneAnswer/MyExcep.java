package phoneAnswer;

public class MyExcep extends Exception {
	private static final long serialVersionUID = 1L;

	int i;

	public MyExcep(int i) {
		this.i = i;
	}

	@Override
	public String getMessage() {
		return i + "번의 선택사항은 존재하지 않습니다.";
	}

}
