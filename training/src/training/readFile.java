package training;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class readFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File f = new File("/home/rad/s2NetboxDev/v_4_9_11_production/global/server/files/conf/server.properties");
        
        
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()){
				//String line = sc.nextLine();
				String line = sc.findInLine("^\\w+[test]*");
				System.out.println(line);
				sc.nextLine();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("File not found");
		}
        
        
	}

}
