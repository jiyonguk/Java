package ex;

public class SutdaCard {
	String num;
	boolean isKwang;

	public SutdaCard() {
		num = "1";
		isKwang = false;
	}

	public SutdaCard(int num, boolean isKwang) {
		this.num = Integer.toString(num);
		this.isKwang = isKwang;
	}

	String info() {
		if (isKwang) {
			String result = num + "k";
			return result;
		}
		return num;
	}

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, true);
		SutdaCard card2 = new SutdaCard();

		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}
