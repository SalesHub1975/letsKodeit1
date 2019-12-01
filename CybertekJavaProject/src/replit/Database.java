package replit;

public class Database {
	
	public static void main(String[] args) {
		
		System.out.println(lameDb("1test#2bla#3foo", "delete", "3", ""));
		
		
	}
	 public static String lameDb(String db, String op,String id,String data) {
	  
	    
	    String result = "";
	    int indexOfNum = db.indexOf(id);
    	int indexOfDash = db.indexOf("#", indexOfNum);
	    
	    if(op.equals("add")){
	       result = db + "#" + id + data;
	    }else if(op.equals("edit")){
	        result = db.replace(db.substring(indexOfNum, indexOfDash), (id + data));
	    }else if(op.equals("delete")) {
	    	result = db.replace((db.substring(indexOfNum, indexOfDash+1)), "");
	    }else if(op.equals("none")){
	    	result = db;
	    }
	    return result;
	 }	    
}


