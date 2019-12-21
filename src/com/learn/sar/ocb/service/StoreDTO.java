package com.learn.sar.ocb.service;

public class StoreDTO {
	//Store object creation
	private int skuNumber;
	private int storeNumber;
	private int skuVelocity;
	private int trkDeliverVelocity;
	private int shelfQty;
	private int inStoreQty;
	private int skuRcmndThreshold;
	private int packSize;
	private int vendrMin;
	
	public StoreDTO(int skuNumber,int storeNumber,int skuRcmndThreshold,int skuVelocity,int trkDeliverVelocity,int shelfQty,int inStoreQty,int packSize,int vendrMin) {
		this.skuNumber = skuNumber;
		this.storeNumber=storeNumber;
		this.skuVelocity=skuVelocity;
		this.trkDeliverVelocity=trkDeliverVelocity;
		this.shelfQty=shelfQty;
		this.inStoreQty=inStoreQty;
		this.skuRcmndThreshold=skuRcmndThreshold;
		this.packSize=packSize;
		this.vendrMin=vendrMin;
		
		
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

	public int getSkuVelocity() {
		return skuVelocity;
	}

	public void setSkuVelocity(int skuVelocity) {
		this.skuVelocity = skuVelocity;
	}

	public int getTrkDeliverVelocity() {
		return trkDeliverVelocity;
	}

	public void setTrkDeliverVelocity(int trkDeliverVelocity) {
		this.trkDeliverVelocity = trkDeliverVelocity;
	}

	public int getShelfQty() {
		return shelfQty;
	}

	public void setShelfQty(int shelfQty) {
		this.shelfQty = shelfQty;
	}

	public int getInStoreQty() {
		return inStoreQty;
	}

	public void setInStoreQty(int inStoreQty) {
		this.inStoreQty = inStoreQty;
	}
	
	public String toString() {
        return "Store [SKUNumber=" + skuNumber + ", SkuRcmndThreshold=" +skuRcmndThreshold + ", SkuVelocity=" +skuVelocity + ", TruckDeliveryVelocity " +trkDeliverVelocity +", ShelfQuantity=" + shelfQty + ",InStoreQuantity=" +inStoreQty
                + "]";
    }

	public int getSkuRcmndThreshold() {
		return skuRcmndThreshold;
	}

	public void setSkuRcmndThreshold(int skuRcmndThreshold) {
		this.skuRcmndThreshold = skuRcmndThreshold;
	}

	public int getPackSize() {
		return packSize;
	}

	public void setPackSize(int packSize) {
		this.packSize = packSize;
	}

	public int getVendrMin() {
		return vendrMin;
	}

	public void setVendrMin(int vendrMin) {
		this.vendrMin = vendrMin;
	}

}
