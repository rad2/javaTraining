package training;

public class endwith_startWith {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] rad ={"Radouane","Yahya","Youmna"};
		
		//StartWith
		for( String r :rad){
			if(r.startsWith("Ra")){
			 System.out.println(r + " starts with ra");
			}
		}
       //EndWith
		for(String r:rad){
			if(r.endsWith("a")){
				System.out.println(r + " ends with a");
			}
		}
	}

}
