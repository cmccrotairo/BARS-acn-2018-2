package com.accenture.tcf.bars.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Request {
	
	@Id
	@GeneratedValue
	@Column(name = "request_id")
	private int id;
	
	@Column(name = "billing_cycle")
	private int billingCycle;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	public Request(int billingCycle, Date date, Date date2) {
		super();
		this.billingCycle = billingCycle;
		this.startDate = date;
		this.endDate = date2;
	}

	public int getBillingCycle() {
		return billingCycle;
	}

	public void setBillingCycle(int billingCycle) {
		this.billingCycle = billingCycle;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
}
