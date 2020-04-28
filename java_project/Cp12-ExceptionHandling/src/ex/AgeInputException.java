package ex;

public class AgeInputException extends Exception {

	public AgeInputException() {
		super("유요하지 않은 나이가 입력되었습니다");
	}

	public AgeInputException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
