package atmAc;

public class ATMAccount {

	private long accId;
	private int accNum;
	private String transType;
	private double accAmount;
	private String txtComment;
	
	
	public long getAccId() {
		return accId;
	}

	public void setAccId(long accId) {
		this.accId = accId;
	}
	
	public int getAccNum() {
		return accNum;
	}
	
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	
	public String getTransType() {
		return transType;
	}
	
	public void setTransType(String transType) {
		this.transType = transType;
	}
		
	public double getAccAmount() {
		return accAmount;
	}
	
	public void setAccAmount(double accAmount) {
		this.accAmount = accAmount;
	}
	
	public String gettxtComment() {
		return txtComment;
	}
	
	public void settxtComment(String txtComment) {
		this.txtComment = txtComment;
	}
}

	
	
	
	
	
	
	
	