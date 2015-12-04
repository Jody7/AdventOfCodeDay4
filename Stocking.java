import java.security.*;
import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

//random edits thrown in here

//very inefficent

class Stocking
{
	
	public static String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		String inpKey = "bgvyzdsv";

		
		int holder = 0;
		
		while(true){
			
			
			String hash = getMD5(inpKey+holder);
			
			System.out.println("----------");
			System.out.println(hash);
			System.out.println(inpKey+holder);
			
			System.out.println(hash.substring(0,5));
			
			if(hash.substring(0,5) == ""){

				System.out.println(hash + "---" + inpKey+holder);
				
				break;
				
			}
			
			
			holder++;
			
			
			if(holder>1000000) break;
			
			
		}
		
	
	}
}
