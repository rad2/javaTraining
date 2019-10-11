package training;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.*;

public class writetofile {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
		String MyFILE = "/home/rad/s2NetboxDev/v_4_9_11_production/global/server/files/conf/server.properties";
	        
	        
			try {
				FileWriter fw = new FileWriter(MyFILE, true);
				PrintWriter fp = new PrintWriter(fw);
				fp.println("testtestest");
				fp.flush();
				fp.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("File not found");
			}
	             
	}

	}


