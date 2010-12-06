/**
 * Copyright (c) 2009-2010, SimpleGeo
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, 
 * this list of conditions and the following disclaimer. Redistributions 
 * in binary form must reproduce the above copyright notice, this list of
 * conditions and the following disclaimer in the documentation and/or 
 * other materials provided with the distribution.
 * 
 * Neither the name of the SimpleGeo nor the names of its contributors may
 * be used to endorse or promote products derived from this software 
 * without specific prior written permission.
 *  
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS 
 * BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE 
 * GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER 
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.simplegeo.client.test;

public class TestEnvironment {

       private static final String ACCESS_KEY = "consumerKey";
       private static final String SECRET_KEY = "consumerSecret";
       private static final String BASE_URL = "http://localhost";
       private static final String PORT = "4567";
       private static final String API_VERSION = "1.0";
       
       private static final String JSON_STRING = "{" +
												    "\"geometry\": { " +
												        "\"type\": \"Point\"," +
												        "\"coordinates\": [" +
												            "-122.937467," +
												            "47.046962" +
												        "]" +
												    "}," +
												    "\"type\": \"Feature\"," +
												    "\"id\": \"SG_4CsrE4oNy1gl8hCLdwu0F0_47.046962_-122.937467@1290636830\"," +
												    "\"properties\": { " +
												        "\"city\": \"Olympia\"," +
												        "\"name\": \"Burger Master West Olympia\"," +
												        "\"tags\": [" +
												            "\"eating\""+
												        "]," +
												        "\"country\": \"us\"," +
												        "\"phone\": \"3603575451\"," +
												        "\"state\": \"WA\"," +
												        "\"address\": \"2820 Harrison Ave NW\"," +
												        "\"owner\": \"simplegeo\"," +
												        "\"categories\": [" +
												            "[" +
												                "\"Food & Drink\"," +
												                "\"Restaurants\"," +
												                "\"\"" +
												            "]" +
												        "]," +
												        "\"postcode\": \"98502\"" +
												    "}" +
												"}";
       
       public static String getKey() throws Exception {
    	   if(ACCESS_KEY.equals("my-key"))
    		   throw new Exception("Please replace ACCESS_KEY with a valid String");

    	   return ACCESS_KEY;
       }
       
       public static String getSecret() throws Exception {
    	   if(SECRET_KEY.equals("my-secret"))
    		   throw new Exception("Please replace SECRET_KEY with a valid String");

    	   return SECRET_KEY;    	   
       }

	public static String getBaseUrl() {
		return BASE_URL;
	}

	public static String getPort() {
		return PORT;
	}

	public static String getApiVersion() {
		return API_VERSION;
	}

	public static String getJsonString() {
		return JSON_STRING;
	}

}