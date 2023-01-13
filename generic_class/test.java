package generic_class;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a<String> obj = new a <>();
		obj.value = "7";
		System.out.println(obj.value.getClass().getName());
	}

}

class a<t>{
	t value;
}