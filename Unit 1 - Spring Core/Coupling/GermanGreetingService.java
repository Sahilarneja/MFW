package coupling;

public class GermanGreetingService implements GreetingService {
	public void greet(String name) {
		System.out.println("Holla, "+name);
	}

}
