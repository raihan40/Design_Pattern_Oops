package composite;

public class leaf implements component {
	int price;
	String name;
	public leaf(int price , String name) {
		super();
		this.price = price;
		this.name = name;
	}
	@Override
	public int show_price() {
		return this.price;
		// TODO Auto-generated method stub
		}

}
