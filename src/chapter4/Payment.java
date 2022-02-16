package chapter4;

public class Payment {

	public static void payCheck(Client c, int summ) {
		c.getCheck().setSumm(c.getCheck().getSumm()-summ);
		System.out.println("Покупка совершена со счета на сумму "+summ);
	}
	
	public static void payCard(Client c, int summ){
		
		try {
			if(c.getCard().getSumm()<summ) {
				c.setCard(null);
			}	
		c.getCard().setSumm(c.getCard().getSumm()-summ);
		System.out.println("Покупка совершена картой на сумму "+summ);
		}catch(NullPointerException e) {
			System.err.print("Карта заблокирована, недостаточно средств \n");
		}
	}
	
	public static void transferToCheck(Client c, Check check, int summ) {
		c.getCheck().setSumm(c.getCheck().getSumm()-summ);
		check.setSumm(check.getSumm()+summ);
	}
	
}
