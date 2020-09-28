
public class Run {

	static int[][] array = {
    		{0,4,0, 0,0,7, 9,6,3}, 
    		{3,5,0, 8,0,2, 4,0,0},
    		{0,0,7, 6,0,0, 8,5,0},	
    		
    		{0,0,4, 0,3,5, 0,0,9},
    		{5,8,0, 0,0,0, 0,3,6},
    		{1,0,0, 9,6,0, 2,0,0},
    		
    		{0,3,8, 0,0,4, 5,0,0},
    		{0,0,5, 3,0,9, 0,1,4},
    		{0,9,0, 5,0,0, 0,2,0},
    };
    
	
	
	public static void main(String[] args) {
		
	
        
        showAll ();
        
       
//        showHorizontalLine (1);
//        showVerticalLine(1);
     
        showSquare(5);
        
	}
	
	
	
	
	
	
	// ТОДО Переробити на стрінг буфер і виводити вже в кінці???
	static void showAll() {
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			if (i == 3 | i == 6)
				System.out.println("---------------------");

			for (int j = 0; j < array[i].length; j++) {
				if (j == 3 | j == 6)
					System.out.print("| ");

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
	
	
	

	static void showHorizontalLine ( int lineNumber) {
		// TODO Перевірка допустимого діапазону lineNumber
		
		for (int i = 0; i < lineNumber; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j == 3 | j == 6)
					System.out.print("| ");
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	
		
	}
	
	
	
	// column
	static void showVerticalLine(int columnNumber) {
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			if (i == 3 | i == 6)
				System.out.println("--");
			System.out.print(array[i][columnNumber - 1] + " \n");
		}
		System.out.println();
	}
	
	
	
	
	
	
	//square
	static void showSquare(int squareNumber) {
	// squareNumber
	//		numbering by floors
	//		From top to bottom
	//		From left to right
	//		1-2-3
	//		4-5-6
	//		7-8-9		
		
		int lineNumber = 0;
		int columnNumber = 0;
		
		if (squareNumber <=3) lineNumber = 0 ;
		if ( squareNumber >= 4 && squareNumber <=6) lineNumber = 3 ;
		if ( squareNumber >= 7 && squareNumber <=9) lineNumber = 6 ;

		if (squareNumber == 1 | squareNumber == 4 | squareNumber == 7 ) columnNumber = 0;
		if (squareNumber == 2 | squareNumber == 5 | squareNumber == 8 ) columnNumber = 3;
		if (squareNumber == 3 | squareNumber == 6 | squareNumber == 9 ) columnNumber = 6;



		
		System.out.println();

		for (int i = lineNumber; i < lineNumber+3; i++) {
			

			for (int j = columnNumber; j < columnNumber+3; j++) {
				
				System.out.print(array[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println();
	
	
}







}















