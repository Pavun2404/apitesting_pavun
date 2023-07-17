package methodOverLoadingAndOverRiding;

public class OverRidingChild extends OverRiding{
	public static void main(String[] args) {
		
		OverRidingChild obj = new OverRidingChild();
		
		((OverRiding) obj).eat();
	}

}
