package scripts;

public class StringMethods {

	public static void main(String[] args) 
	{
		   
		
		    String Mystr="Mindq systems";
		    
		    System.out.println(Mystr.length());
		    
		    System.out.println(Mystr.charAt(4)); //Index will starts with zero
		    
		    //To Read the Last Char
		    
		    System.out.println(Mystr.charAt(Mystr.length()-1));
		    
		    System.out.println(Mystr.indexOf("s",7));
		    
		    //Lower Case
		    
		    System.out.println(Mystr.toLowerCase());
		    
		    //Upper case
		    
		    System.out.println(Mystr.toUpperCase());
		    
		    System.out.println(Mystr.isEmpty()); //false
		    
		    String Mystr1="Mindq";
		    String MyStr2="Systems";
		    
		/*    System.out.println(Mystr1.isEmpty()); //True
		    
		   System.out.println(Mystr1.concat(MyStr2));
		   
		    System.out.println(Mystr1+MyStr2);
		 
		    System.out.println(Mystr1.equals("Mindq")); //True
		    System.out.println(Mystr1.equals("mindq")); //false
		    
		    System.out.println(Mystr1.equalsIgnoreCase("Mindq")); //true
		    
		    System.out.println(Mystr1.startsWith("Mi")); //True */
		    
		    System.out.println(Mystr1.endsWith("dq"));  //True
		    
		    System.out.println(Mystr.contains("Sys"));
	
	        System.out.println(Mystr.trim());
	
	        System.out.println(Mystr.replace("s","#"));
	
	        System.out.println(Mystr.replace("systems","Automation"));
	        
	        System.out.println(Mystr.substring(0,5));
	}

}
