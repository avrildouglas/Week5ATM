package atmAC;

public class ATMAccount {

	private long accId;
	private String accNum;
	private String transType;
	private String accAmount;
	private String txtComment;
	
	
	public long getAccId() {
		return accId;
	}

	public void setAccId(long accId) {
		this.accId = accId;
	}
	
	public String getAccNum() {
		return accNum;
	}
	
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	
	public String getTransType() {
		return transType;
	}
	
	public void setTransType(String transType) {
		this.transType = transType;
	}
		
	public String getAccAmount() {
		return accAmount;
	}
	
	public void setAccAmount(String accAmount) {
		this.accAmount = accAmount;
	}
	
	public String gettxtComment() {
		return txtComment;
	}
	
	public void settxtComment(String txtComment) {
		this.txtComment = txtComment;
	}
}

	
	
	
	
	
	
	
	