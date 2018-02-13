package org.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class Sql_UserInput extends UserDefinedPojo{

	
	
	
	public  List<Sql_UserInput> userInputdata() throws Throwable{
		
		List<Sql_UserInput> emp = new ArrayList<Sql_UserInput>();
		
		
		//Load the Driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//Connect to DB
     	 Connection con = DriverManager.getConnection("jdbc:Mysql://127.0.01:3306/","root","");
     	 
       	//Write a Sql Query
     	String sql ="SELECT * FROM green.facebook;";
     	
       	//Prepare statement
     	PreparedStatement ps = con.prepareStatement(sql);
        	
         //Execute the query
         ResultSet rs =ps.executeQuery();
		
	     //Iterate the rows
         while(rs.next()){
           	
        	 Sql_UserInput fb = new Sql_UserInput();
        	 
          	int userID =rs.getInt("userID");
        	String username =rs.getString("username");
        	String password =rs.getString("password");
        	String firstname =rs.getString("firstname");
        	String lastname =rs.getString("lastname");
        	String email =rs.getString("email");
        	String mobilenumber =rs.getString("mobilenumber");
        	String gender =rs.getString("gender");
        	String url=rs.getString("url");
        	String browser=rs.getString("browser");
        	String dob=rs.getString("DOB");
        	
        	fb.setUserID(userID);
            fb.setUsername(username);
            fb.setPassword(password);
            fb.setFirstname(firstname);
            fb.setLastname(lastname);
            fb.setEmail(email);
            fb.setMobilenumber(mobilenumber);
            fb.setGender(gender);
            fb.setUrl(url);
            fb.setBrowser(browser);
            fb.setDob(dob);
            
            emp.add(fb);    
        }
		
		//Close db
        con.close();
      		
        return emp;

		
	}	
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

