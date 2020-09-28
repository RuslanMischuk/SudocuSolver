
public class Run {

	static int[][] array = {
    		{0,4,0,0,0,7,9,6,3}, 
    		{3,5,0,8,0,2,4,0,0},
    		{0,0,7,6,0,0,8,5,0},	
    		
    		{0,0,4,0,3,5,0,0,9},
    		{5,8,0,0,0,0,0,3,6},
    		{1,0,0,9,6,0,2,0,0},
    		
    		{0,3,8,0,0,4,5,0,0},
    		{0,0,5,3,0,9,0,1,4},
    		{0,9,0,5,0,0,0,2,0},
    };
    
	
	
	public static void main(String[] args) {
		
		
		

        
        
        
        
        showAll ();
        
        

		HorizontalLine (1);
        
        
        
	}
	
	
	// ТОДО Переробити на стрінг буфер і виводити вже в кінці???
	static void showAll() {
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			if ( i == 3 | i == 6)  System.out.println("----------+-----------");
			
			for (int j = 0; j < array[i].length; j++) {
				if ( j == 3 | j == 6)  System.out.print("| ");
				
				System.out.print(array[i][j] + " ");

			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	
	
	
//	static void showAll() {
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				System.out.print(array[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
//	
	
	
	

	static void HorizontalLine ( int lineNumber) {
		// TODO Перевірка допустимого діапазону lineNumber
		
		for (int i = 0; i < lineNumber; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	
		
	}
	
	
	
    //column
	static void VerticalLine(int columnNumber) {
		
		
		
		
		
	}
	
	
	//square

	
	
	
}























