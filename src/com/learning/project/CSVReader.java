package com.learning.project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {
	
	public CSVReader() {
		
	}
	
	public ArrayList<Store> arrayListFromCSVFile() {
		ArrayList<Store> stores = new ArrayList();
		
		try {
			BufferedReader csvReader = new BufferedReader(new FileReader("C://Users//rathe//git//h2kinfosysproject/StoreSKUList.csv"));
			String line;
			csvReader.readLine();
			while((line=csvReader.readLine())!=null) {
			String data[] = line.split(",");
			Store store = createStore(data);
			stores.add(store);}
			csvReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		}
		
				
		return stores;
		
	}
	private static Store createStore(String[] storeDetails) {
		int storeNumber = Integer.parseInt(storeDetails[0]);
		int SKUNumber = Integer.parseInt(storeDetails[1]);
		int shelfQuantity = Integer.parseInt(storeDetails[2]);
		int storeQuantity = Integer.parseInt(storeDetails[3]);
		return new Store(storeNumber,SKUNumber,shelfQuantity,storeQuantity);
		
	}
	
	

}
