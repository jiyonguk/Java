package ex;

public class PointOne {

	private int xPos,yPos;
	
	PointOne(int x,int y){
		this.xPos = x;
		this.yPos = y;
	}

	@Override
	public String toString() {
		return "PointOne [xPos=" + xPos + ", yPos=" + yPos + "]";
	}
}
