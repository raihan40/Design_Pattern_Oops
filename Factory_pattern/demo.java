package Factory_pattern;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		notification_factory fac = new notification_factory();
		notify noti = fac.factory("buzz");
		noti.send();
	}

}
