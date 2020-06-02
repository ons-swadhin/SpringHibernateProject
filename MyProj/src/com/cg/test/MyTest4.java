package com.cg.test;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class MyTest4 {
	
	private static final String BEGIN_MESSAGE_BODY = "\\x3C\\p{Alnum}*:VidageFileCrossDockMessage"; 
	private static final String END_MESSAGE_BODY = "\\x3C\\/\\p{Alnum}*:VidageFileCrossDockMessage\\x3E"; 

	public static void main(String[] args) throws Exception {

		String text    =
	            "This is the text s <ns324234:VidageFileCrossDockMessage to be searched " +
	            "for  occurrences of  the http:// pattern lkdjasd"
	            + "<html>sklhhdsljkfh</html>"
	            + "dasdjaskdnas aslkdjas wuihgqwwqkquiwewe"
	            + ""
	            + "</ns7:VidageFileCrossDockMessage> kljfwe r .<html>sklhhdsljkfh</html>";

			System.out.println(text);
	        //String patternString = "\\x3C.*:VidageFileCrossDockMessage";
			//private static final String END_MESSAGE_BODY = "\\x3C\\/.*:VidageFileCrossDockMessage\\x3E"; 

			
			
			
			Pattern pattern  = null;
			Matcher matcher = null;
			int begin=0,end=0;

	        pattern = Pattern.compile(BEGIN_MESSAGE_BODY);

	        matcher = pattern.matcher(text);
	        
	        if(matcher.find())
	        {
	        	begin = matcher.start();
	       
	        }
	        pattern = Pattern.compile(END_MESSAGE_BODY);

	        matcher = pattern.matcher(text);
	        
	        if(matcher.find())
	        {
	        	end = matcher.end();
	       
	        }
	        
	        System.out.println("begin : "+begin);
	        System.out.println("end : "+end);
	        
	        
	     
	}

	
}
