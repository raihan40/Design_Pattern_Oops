package observer_pattern;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		observer b = new binary();
		observer h = new hex_dec();
		dec d = new dec();
		d.addd(h);
		d.addd(b);
	}

}
