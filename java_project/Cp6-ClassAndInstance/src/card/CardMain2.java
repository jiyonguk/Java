package card;

public class CardMain2 {

	public static void main(String[] args) {
		Card cr = new Card();
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 14; j++) {

				String kind = "";
				switch (i) {
				case 0:
					kind = "Heart";
					break;
				case 1:
					kind = "Spade";
					break;
				case 2:
					kind = "Diamond";
					break;
				case 3:
					kind = "Clover";
					break;
				}
				cr.kind = kind;
				cr.number = j;

				System.out.println(cr.kind + j);
			}
		}

	}
}