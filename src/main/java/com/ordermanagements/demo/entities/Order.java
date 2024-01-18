package com.ordermanagements.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Order1")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderID;
	private String productName;
	private Double cost;
	private Integer quantity;
	private Date date;
	
	/*
	 * @JoinColumn(name="customerid")
	 * 
	 * @ManyToOne private Customer customer;
	 * 
	 * 
	 * 
	 * public Customer getCustomer() { return customer; }
	 * 
	 * 
	 * public void setCustomer(Customer customer) { this.customer = customer; }
	 */


	public Order() {
		super();
	}


	public Order(Integer orderID, String productName, Double cost, Integer quantity, Date date) {
		super();
		this.orderID = orderID;
		this.productName = productName;
		this.cost = cost;
		this.quantity = quantity;
		this.date = date;
	}


	public Integer getOrderID() {
		return orderID;
	}


	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public Double getCost() {
		return cost;
	}


	public void setCost(Double cost) {
		this.cost = cost;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", productName=" + productName + ", cost=" + cost + ", quantity="
				+ quantity + ", date=" + date + "]";
	}
	
	
}
