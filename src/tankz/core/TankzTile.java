package tankz.core;

public class TankzTile {

	private int x;
	private int y;
	private TankzTileState state;
	
	public TankzTile(int x, int y, TankzTileState state){
		this.setX(x);
		this.setY(y);
		this.state = state;
	}
	
	public TankzTileState getState(){
		return this.state;
	}
	
	public void setState(TankzTileState state){
		this.state = state;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}
	public String toString() {
		return "X: " + x + " Y: " + y;
	}
	
}
