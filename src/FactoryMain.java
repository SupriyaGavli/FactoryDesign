import com.phone.os;
import com.phone.shop;
import com.phone.windows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.phone.*;
//import com.phone.Android;
//import com.phone.IOS;
//import com.phone.OsFactory;
import com.Chain.*;

public class FactoryMain {
	private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");
        Authentication authentication=new Time(2); 
        authentication.linkwith(new UserCred(server)).linkwith(new RoleCheck());
    
    server.setMiddleware(authentication);
    }
	public static void main(String a[]) throws IOException
	{    int  choice;
		init();
		OsFactory osf= new OsFactory();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		boolean success;
        do {
            System.out.print("Enter email: ");
            String email = br.readLine();
            System.out.print("Input password: ");
            String password = br.readLine();
            success = server.logIn(email, password);
        } while (!success);
		
		do {
		 System.out.print("========= Mobile ============ \n");  
	        System.out.print("            1. Android.   \n");  
	        System.out.print("            2. IOS.\n");  
	        System.out.print("            3. Windows.         \n");  
	        System.out.print("            4. Exit                        \n");  
	        System.out.print("Enter your choice: ");  
	        
	        choice=Integer.parseInt(br.readLine()); 
	        os obj= osf.getInstance(choice);
	        shop sk=new shop();
    		obj.spec();
	        switch (choice) {  
	        case 1:{   
		    sk.AndroidSale();
		}break;
		
	        case 2:{
	        	sk.IOSSale();
	        }break;
	        
	        case 3:{
	        	
	    		sk.windowssSale();
	        }break;
	        
	        default:{
	        	System.out.println("no other options..");
	        }
	        return;
	        	
	        }
		}while(choice!=4);
	}
}
