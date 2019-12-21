package com.learn.sar.ocb.service;

import java.util.ArrayList;
import java.util.Collections;

public class SarOcb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Connecting to database and storing the store details in arraylist
		
		ShelfAutomationDAO shelfautomationDAO = new ShelfAutomationDAO();
		ArrayList<StoreDTO> skuStore = shelfautomationDAO.getstore();
		
		
		
		//Comparing shelf Quantity and In Store Quantity with Threshold,calculating the
		//number of units and comparing it with pack size and vendor minimum quantities
		//and storing purchase order details in an arraylist-purchaseOrder
		ArrayList<PurchaseOrder> purchaseOrder = new ArrayList<PurchaseOrder>();
		UnitOrderCalculation uocalc = new UnitOrderCalculation();
		for (int i=0;i<skuStore.size();i++) {
			if (((skuStore!=null)&& ((skuStore.get(i))!=null)) && (skuStore.get(i).getShelfQty()+skuStore.get(i).getInStoreQty() < skuStore.get(i).getSkuRcmndThreshold())) {
		purchaseOrder = uocalc.compareRcmndThreshold(skuStore.get(i).getSkuNumber(),skuStore.get(i).getStoreNumber(),skuStore.get(i).getSkuVelocity(),skuStore.get(i).getTrkDeliverVelocity(),skuStore.get(i).getPackSize(),skuStore.get(i).getVendrMin());
		
			}	
		}
		//System.out.println(purchaseOrder.get(0));
		//Inserting the store details in sar_po table
		shelfautomationDAO.savePurchaseOrder(purchaseOrder);
		
		//Email to Store Manager
		SendEmail sendemail = new SendEmail();
		sendemail.mailToStoreManager();
        
	}

}
