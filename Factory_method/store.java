package Factory_method;

public class store {
	public pizza order(String style , String type) {
		return pizza_factory.getFactory(style).order_pizza(type);
		
	}
}
