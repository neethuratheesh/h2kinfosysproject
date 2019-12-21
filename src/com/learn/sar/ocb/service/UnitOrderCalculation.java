package com.learn.sar.ocb.service;

import java.util.ArrayList;

public class UnitOrderCalculation {
	
	private int totalQty;
	private int orderSkuNumber;
	private int StoreNumber;
	private int skuVelocity;
	private int trkDeliverTimeDays;
	private double noOfUnits;
	private int units;
	private int finalNoOfUnits;
	ArrayList<PurchaseOrder> createPurchaseOrder = new ArrayList<PurchaseOrder>();
	
	
	public UnitOrderCalculation() {
		
		
	}
	//Method to compare shelf quantity and store quantity with recommended threshold
	public ArrayList<PurchaseOrder> compareRcmndThreshold(int skuNumber,int storeNumber,int skuVelocity,int trkDeliverTimeDays,int packSize,int vendrMin) {
		//ArrayList<PurchaseOrder> createPurchaseOrder = new ArrayList<PurchaseOrder>();
		
		//totalQty = shelfQty + inStoreQty;
		//if (totalQty<skuRecmndQty) {
			this.orderSkuNumber = skuNumber;
			this.StoreNumber=storeNumber;
			System.out.println("SkuNumber : "+skuNumber);
			units = unitsToBeOrdered(skuVelocity,trkDeliverTimeDays,packSize,vendrMin);
			finalNoOfUnits = vendorCompare(units,vendrMin);
			System.out.println(finalNoOfUnits);
			//this.finalNoOfUnits=finalNoOfUnits;
			PurchaseOrder po = new PurchaseOrder(orderSkuNumber,StoreNumber,finalNoOfUnits);
			createPurchaseOrder.add(po);
		
		return createPurchaseOrder;
		
		
		
	}
	
	//Method to calculate the no of units to be ordered after comparing it with pack size
	public int unitsToBeOrdered(int skuVelocity,int trkDeliverTimeDays,int packSize,int vendrMin) {
		noOfUnits = skuVelocity * trkDeliverTimeDays;
		units = (int) noOfUnits;
		System.out.println(units);
		if ((packSize!=0) && (noOfUnits%packSize!=0)) {
			units= (int)(Math.ceil(noOfUnits/packSize));
			units=units*packSize;
			System.out.println(units);
		}
		return units;
				
	}
	//Method to compare whether the no of units ordered meets the vendor minimum quantity
	public int vendorCompare(int units,int vendrMin) {
		if (units>=vendrMin) {
			units=units;
		}
		else {
			units=vendrMin;}
		return units;
		
	}
	public int getOrderSkuNumber() {
		return orderSkuNumber;
	}
	public void setOrderSkuNumber(int orderSkuNumber) {
		this.orderSkuNumber = orderSkuNumber;
	}
	public int getStoreNumber() {
		return StoreNumber;
	}
	public void setStoreNumber(int storeNumber) {
		StoreNumber = storeNumber;
	}
	public int getSkuVelocity() {
		return skuVelocity;
	}
	public void setSkuVelocity(int skuVelocity) {
		this.skuVelocity = skuVelocity;
	}
	public int getTrkDeliverTimeDays() {
		return trkDeliverTimeDays;
	}
	public void setTrkDeliverTimeDays(int trkDeliverTimeDays) {
		this.trkDeliverTimeDays = trkDeliverTimeDays;
	}
	
	public void setfinalNoOfUnits(int finalNoOfUnits) {
		this.finalNoOfUnits = finalNoOfUnits;
	}
	public int getfinalNoOfUnits() {
		return finalNoOfUnits;
	}
	
	
}
