package com.test.cbstest;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Document(collection = "CbsAccount")
public class CbsAccount {

	//@Id
	private ObjectId id;

	public int getCbsid() {
		return cbsid;
	}

	public void setCbsid(int cbsid) {
		this.cbsid = cbsid;
	}

	private int cbsid;
	private String mobileNo;

	private String accountNo;

	private String bal;

	private String status;


	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getBal() {
		return bal;
	}

	public void setBal(String bal) {
		this.bal = bal;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "CbsAccount [id=" + id + ", mobileNo=" + mobileNo + ", accountNo=" + accountNo + ", bal=" + bal
				+ ", status=" + status + "]";
	}

}
