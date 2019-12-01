package multidimensionalArrays;

public class SumTable {

	public static void main(String[] args) {
		
		int [] [] nums= new int [4][5];
		int [][] numbers = {{14,55,56,45,53}, {34,67,6,34,67}, {45,74,65,43,35}, {10000,10000,10000,10000,10000}};
		
		for(int i=0; i<numbers.length;i++) {              
			for(int j=0; j<numbers[i].length; j++) {         
				System.out.print(numbers[i][j] + "\t");          
		}
		System.out.println();                      
		}

		System.out.println(numbers.length);

		int sum = 0;
		int max = 0;
		
		for(int i=0; i<numbers.length;i++) {              
			for(int j=0; j<numbers[i].length; j++) {        
				sum = sum + numbers[i][j];        
		}
			if(max < sum) {
				max = sum;
		}
			sum = 0;           
			}
		System.out.println(max);
		
		
		
	}
	}

