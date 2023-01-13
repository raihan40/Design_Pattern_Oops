package object_pool;
import java.util.*;
public class pool {
	private static ArrayList <pool> p;
	private int  x = 6;
	private pool(){
		System.out.print("Created!");
	}
	public static void input(int buff) {
	    p = new ArrayList<pool>(buff);
	    for(int i = 0 ; i < buff ;i++) {
	    	p.add(null);
	    }
	}
	public static void increase(int size) {
		p.ensureCapacity(size);
	}
	public static pool get(int i,int buff) {
		if(p.get(i % buff) == null  ) {
			p.set(i % buff,new pool());
			return p.get(i % buff);
		}
		else {
			return p.get(i % buff);
		}
	}
	private void xyz() {
		System.out.println("I am in !");
	}
	
}
