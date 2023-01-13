package Factory_method;

public class NorthIndian_Factory extends pizza_factory {

	@Override
	protected pizza create_pizza(String type) {
		// TODO Auto-generated method stub
		pizza p = null;
		if(type.equals("north_indian")) {
			p = new north_indian_pizza();
		}
		// TODO Auto-generated method stub
		return p;
	}

}
