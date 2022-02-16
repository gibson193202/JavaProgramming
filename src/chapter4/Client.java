package chapter4;

public class Client {
	private String name;
	private Check check;
	private Card card;
	
	public Client(String name, Check check, Card card) {
		this.name=name;
		this.check=check;
		this.card=card;
	}
	
	public Client(String name, int summCheck, int summCard) {
		this(name, new Check(summCheck), new Card(summCard));
	}
	
	public String getName() {
		return name;
	}

	public Check getCheck() {
		return check;
	}

	public void setCheck(Check check) {
		this.check = check;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}
	
	
	

}
