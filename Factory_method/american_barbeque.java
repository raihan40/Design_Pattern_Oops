package Factory_method;

public class american_barbeque implements pizza {

	@Override
	public void prepare() {
		System.out.println("american_barbeque is preparing...");
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
		System.out.println("american_barbeque is baking...");
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
		System.out.println("american_barbeque is cutting...");
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
		System.out.println("american_barbeque is boxing...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
