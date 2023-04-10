package coupling;


public class GreetingServiceFactory {
	public GreetingService getGreetingService(String lang) {
		if(lang.equals("English")) {
			return new EnglishGreetingService();
		}else {
			if(lang.equals("Spanish")) {
				return new FrenchGreetingService();
			}else if(lang.equals("French")){
				return new FrenchGreetingService();
			}}
		}
	}
