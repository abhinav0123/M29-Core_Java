package org.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		HDFCBank h = new HDFCBank();
		h.setCardNo(23456789234L);
		h.setCardType("Debit- Card");
		h.setCVVNo(444);
		h.setPinNo(1001);
		System.out.println(h.getCardNo());
		System.out.println(h.getCardType());
		System.out.println(h.getCVVNo());
		System.out.println(h.getPinNo());
		
		
	}

}
