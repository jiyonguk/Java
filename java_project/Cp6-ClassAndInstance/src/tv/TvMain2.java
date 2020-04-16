package tv;

public class TvMain2 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();

		
			t1.channel = 9;
			t1.channelUp();
			System.out.println("Tv1 : "+t1.channel);

			t2.channel = 6;
			t2.channelDown();
			System.out.println("Tv2 : "+t2.channel);

			t1.power = !t1.power;
			System.out.println("Tv1 : "+t1.power);

			t2.power = t2.power;
			System.out.println("Tv2 : "+t2.power);

		}

	}
