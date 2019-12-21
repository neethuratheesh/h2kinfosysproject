package com.learn.sar.ocb.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class ShelfAutomationDAO {
	
	private static String url= "jdbc:mysql://localhost:3306/sar";
	private static String userName = "root";
	private static String password = "shreya@123";
	private static String query1 = "select c1.SKU_NUMBER,c1.STORE_NUM,c2.SKU_RCMD_THRD,c1.SKU_VELOCITY,c1.TRK_DLVR_TIME_DAYS,c2.PACK_SIZE,C2.VENDR_MIN,c1.SHELF_QTY,c1.IN_STR_QTY \r\n" + 
			"FROM sku_store c1,sar_parm c2\r\n" + 
			"where c1.SKU_NUMBER=c2.SKU_NUMBER AND c1.STORE_NUM = ?";
	private static String po_numberquery = "select LAST_PO_NUM from po_number";
	private static String insertQuery = "INSERT INTO sar_po (PO_NUMBER,SKU_NUMBER,STR_NUMBER,ORDR_QTY) values(?,?,?,?)";
	private static String updatepo_numberquery = "Update po_number set LAST_PO_NUM = ?";
	
	
	//Registering Driver and connecting with database with username and password
	public static Connection getConnection() {
		Connection conn = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Properties props = new Properties();
		props.setProperty("user",userName);
		props.setProperty("password",password);
		
		conn = DriverManager.getConnection(url, props);
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
	}
	//Retrieving the store details from database,creating a store object and storing it in an arraylist
	public ArrayList<StoreDTO> getstore() {
		Connection conn = getConnection();
		StoreDTO store = null;
		PreparedStatement pStat = null;
		ResultSet rs = null;
		ArrayList<StoreDTO> storeDetails = new ArrayList<StoreDTO>();
		try {
			pStat = conn.prepareStatement(query1);
			pStat.setInt(1, 501);
			rs =pStat.executeQuery();
			int skuNumber = 0;
			int storeNumber = 0;
			int skuVelocity = 0;
			int trkDeliverVelocity = 0;
			int shelfQty = 0;
			int inStoreQty = 0;
			int skuRcmndThreshold = 0;
			int packSize = 0;
			int vendrmin = 0;
			while(rs.next()) {
				skuNumber = rs.getInt("SKU_NUMBER");
				storeNumber = rs.getInt("STORE_NUM");
				skuVelocity = rs.getInt("SKU_VELOCITY");
				trkDeliverVelocity = rs.getInt("TRK_DLVR_TIME_DAYS");
				shelfQty =rs.getInt("SHELF_QTY");
				inStoreQty =rs.getInt("IN_STR_QTY");
				skuRcmndThreshold = rs.getInt("SKU_RCMD_THRD");
				packSize = rs.getInt("PACK_SIZE");
				vendrmin = rs.getInt("VENDR_MIN");
				store = new StoreDTO(skuNumber,storeNumber,skuRcmndThreshold,skuVelocity,trkDeliverVelocity,shelfQty,inStoreQty,packSize,vendrmin);
				storeDetails.add(store);
		}
			conn.close();
			}catch (NullPointerException nex) {
			nex.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return storeDetails;
		
			
			
		
	}
	
	
	public void savePurchaseOrder(ArrayList<PurchaseOrder> po) {
		Connection conn = getConnection();
		PreparedStatement pStat = null;
		ResultSet rs = null;
		int lastPoNumber = 0;
		
		try {
		
		pStat = conn.prepareStatement(po_numberquery);
		rs =pStat.executeQuery();
		while (rs.next()) {
		lastPoNumber=rs.getInt("LAST_PO_NUM");
		}
		
		/*pStat = conn.prepareStatement("select * from sar_po");
		rs = pStat.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + ","+rs.getInt(2) + ","+rs.getInt(3) + ","+rs.getInt(4) );
		}*/
		int newponumber = lastPoNumber+1;
		for(int i=0;i<po.size();i++) {
		pStat = conn.prepareStatement(insertQuery);
		
		pStat.setInt(1,newponumber);
		
		pStat.setInt(2,po.get(i).getSkuNumber());
		pStat.setInt(3,po.get(i).getStoreNumber());
		pStat.setInt(4,po.get(i).getOrderUnit());
		int rowsAffected = pStat.executeUpdate();
		System.out.println("Rows Affected :" +rowsAffected);
		pStat = conn.prepareStatement(updatepo_numberquery);
		pStat.setInt(1,newponumber+1);
		int rows =  pStat.executeUpdate();
		System.out.println("PO Update Rows Affected : " +rows);
		}
		//conn.commit();
		conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}



}
