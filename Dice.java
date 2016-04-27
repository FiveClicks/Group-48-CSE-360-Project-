import java.util.ArrayList;

public class Dice {

	private int faceNumber = 0;
	private boolean isRolled = false;
	
	public Dice(){
		faceNumber = 0;
		isRolled = false;
	}
	
	// sets the electron number.
	public void setFaceNumber(int faceNum){
		this.faceNumber = faceNum;
	}
	
	// gets the electron number.
	public int getFaceNumber(){
		return faceNumber;
	}
	
}