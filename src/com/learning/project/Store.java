package com.learning.project;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Store {
	
	private int storeNumber;
	private int SKUNumber;
	private int shelfQuantity;
	private int storeQuantity;
	
	public Store(int storeNumber,int SKUNumber,int shelfQuantity,int storeQuantity) {
		this.setStoreNumber(storeNumber);
		this.setSKUNumber(SKUNumber);
		this.setShelfQuantity(shelfQuantity);
		this.setStoreQuantity(storeQuantity);
		
	}
	
	
	public ArrayList<Integer> purchaseList(int SKUNumber,int shelfQuantity,int storeQuantity) {
		ArrayList<Integer> SKUList = new ArrayList();
		if  (storeQuantity< (2*shelfQuantity)) {
			
			SKUList.add(SKUNumber);
					}
		
		return SKUList;
			
			
			
		
			
		
		
		    
		
		
		
	}

	public int getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(int storeNumber) {
		this.storeNumber = storeNumber;
	}

	public int getSKUNumber() {
		return SKUNumber;
	}

	public void setSKUNumber(int sKUNumber) {
		SKUNumber = sKUNumber;
	}

	public int getShelfQuantity() {
		return shelfQuantity;
	}

	public void setShelfQuantity(int shelfQuantity) {
		this.shelfQuantity = shelfQuantity;
	}

	public int getStoreQuantity() {
		return storeQuantity;
	}

	public void setStoreQuantity(int storeQuantity) {
		this.storeQuantity = storeQuantity;
	}
	
	 public String toString() {
	        return "Store [StoreNumber=" + storeNumber + ", SKUNumber=" + SKUNumber + ", ShelfQuantity=" + shelfQuantity + ",StoreQuantity=" +storeQuantity
	                + "]";
	    }

}
