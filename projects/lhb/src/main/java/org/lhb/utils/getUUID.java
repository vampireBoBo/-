package org.lhb.utils;

import java.util.UUID;

@SuppressWarnings("all")
public class getUUID {
	
	   public static String getUUID() {  
	        UUID uuid = UUID.randomUUID();  
	        return UUID.randomUUID().toString().replace("-", "");  
	    }  
}