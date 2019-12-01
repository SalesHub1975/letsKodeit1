package arrays;

public class StudentsArray {

	public static void main(String[] args) {
		
		// Create String array for students
	    //Initialize with students below: James,John, Adam, Elize, Jamie, Benzema
	    // Loop through each elements of students
	    //Print first character of each name on each line
		
		String[] player = {"James", "John", "Adam", "Jamie", "Benzema"}; 
		
//		for(int i=0; i<player.length; i++) {
//			System.out.println(player[i].charAt(0));
//		}
		
		for(int i=0; i<player.length; i++) {
			if(player[i].endsWith("s")){
				System.out.println(player[i]);
		}
		
	}
	}
}
