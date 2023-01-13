package object_pool;
import java.util.*;
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try (Scanner in = new Scanner(System.in)) {
		System.out.println("Enter your pool size!");
		int buff = in.nextInt();
       pool.input(buff);
       while(true) {
       System.out.println("Do you want to increase the buffer size?");
		String chcek = in.next();
		   if(chcek.equals("yes")) {
			   System.out.println("Enter the buffer size?");
			   int size = in.nextInt();
			   pool.increase(size);
			   buff = size;
		   }
		   System.out.println("how many object you need?");
		   int need = in.nextInt();
		   for(int i = 0 ; i < need ; i++) {
			   System.out.println("for "+i+"th request pool granted object no. "+(i%buff)+" "+pool.get(i,buff));
		   }
		   System.out.println("Wanna try once again?");
		   chcek = in.next();
		   if(chcek.equals("no")) {
			   System.exit(0);
		   }
       }
	}
       
	}

}
