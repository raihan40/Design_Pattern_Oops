package composite;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		component obj1 = new leaf(5000,"Ram");
		component obj2 = new leaf(6000,"sham");
		component obj3 = new leaf(7000,"jodu");
		component obj4 = new leaf(8000,"madhu");
		component obj5 = new leaf(9000,"prakash");
		composite obj6 = new composite("Raihan",22000);
		composite obj7 = new composite("Arnab",35000);
		obj6.add_component(obj1);
		obj6.add_component(obj2);
		obj6.add_component(obj3);
		obj6.add_component(obj4);
		obj6.add_component(obj5);
		obj7.add_component(obj6);
		obj7.show_price();
	}

}
