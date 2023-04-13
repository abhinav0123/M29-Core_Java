package org.tnsif.encapsulation;

public class HDFCBank {
 private long cardNo;
 private String cardType;
 private int CVVNo;
 private int pinNo;
public HDFCBank(long cardNo, String cardType, int cVVNo, int pinNo) {
	super();
	this.cardNo = cardNo;
	this.cardType = cardType;
	CVVNo = cVVNo;
	this.pinNo = pinNo;
}
public HDFCBank() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "HDFCBank [cardNo=" + cardNo + ", cardType=" + cardType + ", CVVNo=" + CVVNo + ", pinNo=" + pinNo + "]";
}
public long getCardNo() {
	return cardNo;
}
public void setCardNo(long cardNo) {
	this.cardNo = cardNo;
}
public String getCardType() {
	return cardType;
}
public void setCardType(String cardType) {
	this.cardType = cardType;
}
public int getCVVNo() {
	return CVVNo;
}
public void setCVVNo(int cVVNo) {
	CVVNo = cVVNo;
}
public int getPinNo() {
	return pinNo;
}
public void setPinNo(int pinNo) {
	this.pinNo = pinNo;
}

}
