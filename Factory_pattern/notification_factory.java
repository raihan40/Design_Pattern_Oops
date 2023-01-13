package Factory_pattern;

public class notification_factory {
	public notify factory(String type) {
		notify s = null;
		if(type.equals("sms")) {
			s = new Sms();
		}
		if(type.equals("email")) {
			s = new email();
		}
		if(type.equals("buzz")) {
			s = new buzz();
		}
		
		return s;
		
		
	}
}
