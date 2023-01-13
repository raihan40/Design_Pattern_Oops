package Factory_method;

public class north_indian_pizza  implements pizza {

	@Override
	public void prepare() {
		System.out.println("North_indian pizza is preparing...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("North_indian pizza is baking...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("North_indian pizza is cutting...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("North_indian pizza is boxing...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
