package com.learn.sar.ocb.service;

public class PurchaseOrder  {
	private int skuNumber;
	private int storeNumber;
	private int orderUnit;
	
	public PurchaseOrder(int skuNumber,int storeNumber,int orderUnit) {
		this.setSkuNumber(skuNumber);
		this.setStoreNumber(storeNumber);
		this.setOrderUnit(orderUnit);
		
	}

	public int getSkuNumber() {
		return skuNumber;
	}

	public void setSkuNumber(int skuNumber) {
		this.skuNumber = skuNumber;
	}

	public int getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(int storeNumber) {
		this.storeNumber = storeNumber;
	}

	public int getOrderUnit() {
		return orderUnit;
	}

	public void setOrderUnit(int orderUnit) {
		this.orderUnit = orderUnit;
	}
	
	/*@Override
	public int compareTo(PurchaseOrder porder) {
		// TODO Auto-generated method stub
		int comparestoreno=((PurchaseOrder)porder).getStoreNumber();
        /* For Ascending order*/
      //  return this.storeNumber-comparestoreno;

        /* For Descending order do like this */
        //return compareage-this.studentage;
    
		
	
	public String toString() {
        return "Purchase Order [SKU Number=" + skuNumber + ", Store Number=" +storeNumber + ", Order Units=" + orderUnit
                + "]";
    }


}
