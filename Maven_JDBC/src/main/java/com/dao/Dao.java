package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ahimdata.model.Datas;

public class Dao {
	public Datas getDatas(int id) {
		
		Datas data= new Datas();
		
		
//		data.setId(1);
//		data.setName("Ranbir Kapoor");
//		data.setCourse("BIT");
//		data.setAddress("Lamatar");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Advance_Java","root","");
			Statement st= con.createStatement();
			ResultSet rs =st.executeQuery("select * from AhimsTable where id="+id);
			while(rs.next()) {
				data.setId(rs.getInt("id"));
				data.setName(rs.getString("Name"));
				data.setCourse(rs.getString("Course"));
				data.setAddress(rs.getString("Address"));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return data;
		
	}
}
