package single_tone;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a obj1 ,obj2;
		obj1 = a.get();
		obj2 = a.get();
		System.out.println(obj1);
		System.out.println(obj2);
	}

}

class a{
	private static  a obj = null;
	private a() {}
	public static a get() {
		if(obj == null) {
			obj = new a();
		}
		return obj;
		
	}
	
}