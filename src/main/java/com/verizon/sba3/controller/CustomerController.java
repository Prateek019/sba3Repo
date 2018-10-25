package com.verizon.sba3.controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.sba3.model.Customer;

@RestController
@RequestMapping("/")
public class CustomerController {

	@GetMapping("/getall")
	public List<Customer> getAllCustomers(){
		
		List<Customer> customer=new ArrayList<>();
		
		
		 try
		    {
		      // createmysql database connection
		      String driver = "com.mysql.jdbc.Driver";
		      String url = "jdbc:mysql://kpseven.czmtxa4ndlm1.us-east-2.rds.amazonaws.com:3306/mytestdb?useSSL=false";
		      
		      
		      /*
		       *  "kpseven.czmtxa4ndlm1.us-east-2.rds.amazonaws.com"
		       *  is the RDS instance from AWS - database is mytestdb and port is 3306
		       *   
		       */
		      
		      
		      Class.forName(driver);
		      Connection conn = DriverManager.getConnection(url, "user", "password");
		      
		      //database query 
		      String query = "SELECT * FROM customers";

		      Statement st = conn.createStatement();
		      
		      ResultSet rs = st.executeQuery(query);
		      
		      
		      while (rs.next())
		      {
		        int cid = rs.getInt("cid");
		        String cname = rs.getString("customerName");
		        Date doj = rs.getDate("dateofjoining");
		        String city = rs.getString("city");
		        String cno = rs.getString("contactNo");
		        
		        // print the results
		        customer.add(new Customer(cid, cname, doj, city, cno));
		       
		      }
		      st.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
		 return customer;
	}
}
