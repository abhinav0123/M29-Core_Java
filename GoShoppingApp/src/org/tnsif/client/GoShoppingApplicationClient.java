package org.tnsif.client;
import org.tnsif.application.GSNormalAcc;
import org.tnsif.application.GSPrimeAcc;
import org.tnsif.application.GSShopFactory;
import org.tnsif.framework.ShopFactory;
import org.tnsif.framework.NormalAcc;
import org.tnsif.framework.PrimeAcc;

public class GoShoppingApplicationClient {
	public static void main(String args[]) {
		ShopFactory s = new GSShopFactory();
		PrimeAcc p = new GSPrimeAcc(5760,"John Smith",570,true);
		NormalAcc n = new GSNormalAcc(2370,"Rohit Sharma",270,60);
		System.out.println("Prime Acoount");
		p.bookProduct(p.getCharges());
		System.out.println("Normal Account");
		n.bookProduct(n.getCharges());
		System.out.println(p);
		System.out.println(n);
	}
}
