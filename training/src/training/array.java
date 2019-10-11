package training;

import java.util.Arrays;

public class array {
	
	static final String[] MY_STATUS ={"Pending","Processing","Processed"};

	/**
	 * @param args
	 */
	public static String[] MyStatus(){
		return Arrays.copyOf(MY_STATUS,MY_STATUS.length);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = array.MyStatus();
				System.out.println(arr);
	}

}
