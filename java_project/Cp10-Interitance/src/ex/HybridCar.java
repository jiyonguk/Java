package ex;

public class HybridCar extends Car {
	
	int electronicGauge;
	
	HybridCar(int gasolineGauge,int electronicGauge){
		super(gasolineGauge);
		this.electronicGauge=electronicGauge;
	}

}
