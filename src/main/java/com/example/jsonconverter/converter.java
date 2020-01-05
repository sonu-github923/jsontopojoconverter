package com.example.jsonconverter;

import java.io.File;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

//import com.fasterxml.jackson.databind.ObjectMapper;

public class converter {

//	String jsonString = "{\"name\":\"Mahesh\", \"age\":21}"; 
//    
//    GsonBuilder builder = new GsonBuilder(); 
//    //builder.setPrettyPrinting()
//    
//   // Gson gson = builder.create(); 
//    //Student student = gson.fromJson(jsonString, Student.class); 
//    //System.out.println(student); 

	public static void main(String args[]) {

	    String json = "{ 'name':'John', 'email':'john.doe@gmail.com','age':29, 'phone':5168161922, 'city':'NewYork', 'hasCreditCard':false }";
	    
	    Gson gson = new Gson();
	    
	    UserDetails user = gson.fromJson(json, UserDetails.class);
	    
	    System.out.println(user.getAge()); 
	
}
}
