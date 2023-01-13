package Factory_method;

public abstract class pizza_factory {
	protected abstract pizza create_pizza(String type);
	 public  pizza order_pizza(String type){
		 pizza p = create_pizza(type);
		 p.prepare(); 
		 p.bake(); 
		 p.cut(); 
		 p.box();
		 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Your pizza is ready!");
		 return p;
		 }
	 public static pizza_factory getFactory(String style){
		 pizza_factory factory = null;
		 if(style.equals("American"))
				 factory = new American_Factory();
		 else if(style.equals("NorthIndian")) 
				 factory = new NorthIndian_Factory();
		 else if(style.equals("barbeque")) 
				 factory = new Barbeque_Factory();
		 return factory;
		 }

}
