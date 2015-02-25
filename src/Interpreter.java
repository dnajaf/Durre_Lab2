import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Interpreter 
{   
	public boolean checkvalid() throws IOException
	{
   
      
        //reading file line by line in Java using BufferedReader       
        FileInputStream fis = null;
        BufferedReader reader = null;
      
        try {
            fis = new FileInputStream("C:/Users/dnajaf.bscs12seecs/Desktop/File.txt");
            reader = new BufferedReader(new InputStreamReader(fis));
          
            System.out.println("Reading File line by line using BufferedReader");
          
            String line = reader.readLine();
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
                
         /////////////////////////////////////////////////////////
       
                
                String str;
          while ((str = reader.readLine()) != null) 
          {
                    
              String[]check=str.split(" ");
               if(check[0].compareToIgnoreCase("Let")==0)   	// Check for declaration
		{
                  String[]check2 = check[1].split("=");
                    if(check2.length==1)
                {
                    System.out.println("No '=' operater found.");
                           //return false;
                }
                else{
                     try
		{
                     Integer.parseInt(check2[0]);
                     System.out.println("Invalid syntax");
                   }
                    catch(Exception e){
              System.out.println("Valid syntax!!");
                                
                  
            } 
  
   
                reader.close();	// close the file after reading.
                fis.close();
                
            }
        }
        System.out.println(str);
    }
	return false;
            }
        } finally {}
		return false;
	}
	

public static void main(String[] args) throws IOException 
{
Interpreter obj = new Interpreter();     // Object of Class Interpreter
obj.checkvalid();
}
	
}

