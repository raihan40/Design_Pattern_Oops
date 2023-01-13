package composite;

import java.util.ArrayList;

public class composite implements component {
	ArrayList<component> com = new ArrayList<>();
	String name;
    public int price;
	composite(String name , int price){
		super();
    	this.name = name;
    	this.price = price;
    }
	
	public int show_price() {
		// TODO Auto-generated method stub
		int total = this.price;
		for(int i = 0 ; i < com.size();i++) {
			total = total + com.get(i).show_price();
		}
		System.out.println("Total for composite element "+this.name+" is "+total);
		return total;
	}
	public void add_component(component obj) {
		com.add(obj);
	}

}
