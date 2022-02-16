package chapter4;

public class B2 {
	public static void main(String[] args) {
		Client c=new Client("Tone", new Check(200), new Card(1000));
		Check ck=new Check(0);
		Payment.payCard(c, 900);
		System.out.println(c.getCard().getSumm());
		Payment.payCard(c, 90);
		Payment.payCard(c, 20);
		Payment.payCard(c, 20);
		Payment.payCheck(c, 20);
		
	}
}
