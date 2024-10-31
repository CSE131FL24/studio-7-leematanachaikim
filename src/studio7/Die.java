package studio7;

public class Die {

	private int sides;
	
	public Die(int n) {
		sides = n;
	}
	
	public int throwD() {
		int rand = (int)(Math.random()*sides)+1;
		return rand;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die d1 = new Die(6);
		System.out.println(d1.throwD());
	}

}
