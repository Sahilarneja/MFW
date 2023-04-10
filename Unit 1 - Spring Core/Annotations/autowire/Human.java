package autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	private Heart heart;

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	public void startPumping() {
		if(heart!=null) {
		heart.pump();
		}else {
			System.out.println("Dead");
		}
	}
	@Autowired
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}
}
