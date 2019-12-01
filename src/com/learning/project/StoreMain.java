package com.learning.project;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreMain {

	public static void main(String[] args) throws IOException {
		
		//Reading StoreSKUList.csv file and storing it in an arraylist
		CSVReader readfile = new CSVReader();
		ArrayList<Store> storesDetails = new ArrayList();
 		storesDetails =  readfile.arrayListFromCSVFile();
 		
 		
		int store1 = 101;
		int store2 = 102;
		
		//ArrayList to store SKUlist to order additional items  - store 101
		ArrayList<Integer> skulist101 = new ArrayList<Integer>();
		//ArrayList to store SKUlist to order additional items - store 102
		ArrayList<Integer> skulist102 = new ArrayList<Integer>();

		
		//Creating the purchase list (SKUList) of store 101 based on shelf and store quantity
 			for (Store eachStore: storesDetails) {
 					if ((eachStore!=null)&&(eachStore.getStoreNumber()==store1)) {		
 					ArrayList<Integer> orderList=  eachStore.purchaseList(eachStore.getSKUNumber(),eachStore.getShelfQuantity(),eachStore.getStoreQuantity());
 					//System.out.println(orderList.size());
 					skulist101.addAll(orderList);
		 			
 					}
 					
 				
 			}
 		
 			//Creating the purchase list (SKUList) of store 102 based on shelf and store quantity

 			for (Store eachStore: storesDetails) {
					if ((eachStore!=null)&&(eachStore.getStoreNumber()==store2)) {		
					ArrayList<Integer> orderList=  eachStore.purchaseList(eachStore.getSKUNumber(),eachStore.getShelfQuantity(),eachStore.getStoreQuantity());
					//System.out.println(orderList.size());
					skulist102.addAll(orderList);
	 			
					}
					
				
			}
 			
 			//Writing the SKUList to files
 			BufferedWriter store101out =new BufferedWriter(new FileWriter("C://Users//rathe//git//h2kinfosysproject//StoreNumber_101.txt"));     
 			BufferedWriter store102out =new BufferedWriter(new FileWriter("C://Users//rathe//git//h2kinfosysproject//StoreNumber_102.txt"));     
 			
 			
 			for (int i=0;i<skulist101.size();i++) {
 				store101out.write(skulist101.get(i) + System.lineSeparator());
 				
 				//System.out.println(skulist.get(i));
 			}
 			
 			store101out.flush();
 			store101out.close();	
 			//Writing the purchase list of store102 to StoreNumber_102.txt

 			for (int i=0;i<skulist102.size();i++) {
 				store102out.write(skulist102.get(i) + System.lineSeparator());
 				
 				//System.out.println(skulist.get(i));
 			}
 			
 			store102out.flush();
 			store102out.close();	
 			
 			
 			
			
	}
}
 			
		
		
		
		
				
		
		
	
	
	
	
	
	
	
	
	

