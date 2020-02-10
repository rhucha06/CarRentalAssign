package com.example.demo.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="payment")
public class Payment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long paymentId;
	private String payMode;
	private double totalFare;
	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Payment(long paymentId, String payMode, double totalFare) {
		super();
		this.paymentId = paymentId;
		this.payMode = payMode;
		this.totalFare = totalFare;
	}
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public String getPayMode() {
		return payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	public double getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", payMode=" + payMode + ", totalFare=" + totalFare + "]";
	}
	
	
	
}
