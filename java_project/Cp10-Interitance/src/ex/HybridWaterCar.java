package ex;

public class HybridWaterCar extends HybridCar {
	int waterGauge;

	HybridWaterCar(int electronicGauge, int gasolineGauge, int waterGauge) {
		super(gasolineGauge, electronicGauge);
		this.waterGauge = waterGauge;
	}

	public void showCurrentGauge() {
		System.out.println("잔여 가솔린 : " + gasolineGauge);
		System.out.println("잔여 전기 : " + electronicGauge);
		System.out.println("잔여 물 : " + waterGauge);
	}

}