package reflexion;
import java.lang.reflect.*;
import java.lang.*;
import java.util.*;

import object_pool.pool;

public class reflexion {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
		// TODO Auto-generated method stub
		try {
			Class<?> c = Class.forName("object_pool.pool");
			Constructor con = c.getDeclaredConstructor();
			con.setAccessible(true);
			Object obj = con.newInstance();
		    System.out.println(obj);
		    Field f = c.getDeclaredField("x");
		    f.setAccessible(true);
		    f.set(obj, 50);
		    System.out.println(f.get(obj));
		    Method mx = c.getDeclaredMethod("xyz");
		    mx.setAccessible(true);
		    System.out.println(mx.invoke(obj));
		    Method m[] = c.getMethods();
		    
		    System.out.println(Arrays.toString(m));
		    Field fie[] = c.getFields();
		    System.out.println(Arrays.toString(fie));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
