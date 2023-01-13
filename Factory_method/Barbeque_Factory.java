package Factory_method;

public class Barbeque_Factory extends pizza_factory {

	@Override
	protected pizza create_pizza(String type) {
		// TODO Auto-generated method stub
		pizza p = null;
		if(type.equals("barbeque")) {
			p = new barbeque_pizza();
		}
		// TODO Auto-generated method stub
		return p;
	}

}
