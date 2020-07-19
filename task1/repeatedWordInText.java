
 //Write a Java Program to Find the Most Repeated Word in Text File
import java.io.IOException;
import java.io.*;
import java.util.*;
//Write a Java Program to Find the Most Repeated Word in Text File
public class repeatedWordInText {
	public static String find() throws IOException   
	    {   
	        FileReader sourceStream = null; 
	        HashMap<String, Integer> map = new HashMap<>();
	        try  
	        {   
	        	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
       			System.out.println("Enter the File Name :");  
       			String x=br.readLine();  
	            sourceStream = new FileReader(x);   
	            // Reading sourcefile and writing content to   
	            // target file character by character.   
	            int temp;   
	            StringBuilder sb = new StringBuilder();
	            while ((temp = sourceStream.read()) != -1) {
	            	char c = (char)temp;
	            	if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
	            		sb.append(c);
	            	}
	            	else {
	            		if (sb.length() > 0) {
	            			map.put(sb.toString(), map.getOrDefault(sb.toString(),0)+1);
	            			sb.setLength(0);
	            		}
	            	} 
	            }

	            int maxcnt = 0;
	            String res = "";
	            for (Map.Entry element: map.entrySet()) {
	            	String key = (String)element.getKey(); 
	            	int value = (int)element.getValue(); 
	            	if (value > maxcnt) {
	            		maxcnt = value;
	            		res = key;
	            	}
	            	//System.out.println(key + " : " + value); 
	            }
	            return res;  
	               
	        }   
	        finally  
	        {              
	            // Closing stream as no longer in use   
	            if (sourceStream != null)              
	                sourceStream.close();          
	        }   
	    } 

	public static void main(String[] args) {
		try {
			System.out.println("Most Repeated Word in Text File is : " + find());

		} catch (IOException e) {
			System.out.println("exception occur");
		}
	}

}

//System.out.println((char)temp);   