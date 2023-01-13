package Factory_method;

public class American_Factory extends pizza_factory {

	@Override
	protected pizza create_pizza(String type) {
		System.out.println("Your desired style is American!");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pizza p = null;
		if(type.equals("american_chicken")) {
			System.out.println("Your desired type is American_Chicken!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			p = new american_chicken();
		}
		if(type.equals("american_paneer")) {
			System.out.println("Your desired style is American_Panner!");
			p = new american_paneer();
		}
		if(type.equals("american_barbeque")) {
			System.out.println("Your desired style is American_Barbeque!");
			p = new american_barbeque();
		}
		// TODO Auto-generated method stub
		return p;
	}

}
