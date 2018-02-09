//Team GitCoin - Jason Kim, Mohtasim Howlader, Ying Xin Jiang
//APCS2 pd8
//Lab#00 -- But What Does the Data Say?
//2018-02-09 F

/* We begin with the integer at the top right position of the matrix, (0, n-1). We also establish integer varibles called row and column, to represent the current position we are in the matrix. We then start our while loop that has the condition, if the target number and the integer at the current position are NOT equal, run the body. In the body, we check if the target is greater than the current position, (row,col). If yes, we move down a row. If not, we move to the left a column. We then check if we are out of bounds. If yes, we return (-1,-1). Once we get out of the loop, we return (row, col) */

public class MatrixFinder {
    public static String search(int[][] matrix, int target) {
	int len=matrix.length; //variable that represents the length of the matrix
	int col=len-1; //variable that indicates the col of the current position
	int row=0; //variable that indicates the row of the current position
	
	while (matrix[row][col] != target) { //while the current position is not equal to the target
	    if (target>matrix[row][col]) { //if the target is greater
		row=row+1; //go down a row
	    }
	    else {
		col=col-1; //go to the left
	    }
	    
	    if (row>=len || col < 0) { //if out of bounds
		return "(-1,-1)"; //the target doesn't exist in the array
	    }
	}
	return "(" + row + "," + col + ")"; //return the coordinates
    }
    
    public static void sop(Object s) { //shortens sop statements
	System.out.println(s);
    }

    public static String print(int[][] arr) { //returns a string of the matrix in matrix-like form
	String ret = "";
	for (int i=0; i<arr.length;i++) {
	    for (int j=0; j<arr.length;j++) {
		ret += arr[i][j] + " ";
	    }
	    ret += "\n";
	}
	return ret;
    }

    public static void populate(int[][] arr) {
	int n=0;
	for (int i=0; i<arr.length;i++) {
	    for (int j=0; j<arr.length;j++) {
		arr[i][j]=n;
		n+=2;
	    }
	    n -= (arr.length-1) * 2;
	}
    }
    
    public static int topRight(int[][] arr) {
	return arr[0][arr.length-1];
    }
    
    public static void experiment() {
	int counter;

	System.out.println("NEW TRIAL============================");
	
	counter = 0;
	int[][] arr1 = new int[1000][1000];
	populate(arr1);
	int find1 = topRight(arr1);
	int best1 = find1;
	int worst1 = find1 - 1;
	double time11 = System.currentTimeMillis();
	while (counter < 100000) {
	    search(arr1,best1);
	    counter++;
	}
	double time12 = System.currentTimeMillis();
	double timeBest1 = time12 - time11;
	counter = 0;
	double time13 = System.currentTimeMillis();
	while (counter < 100000) {
	    search(arr1,worst1);
	    counter++;
	}
	double time14 = System.currentTimeMillis();
	double timeWorst1 = time14 - time13;
	System.out.println("1000x1000: \nBest: " + timeBest1 +"\nWorst: "+ timeWorst1);

	System.out.println("=====================================");
	
	counter = 0;
	int[][] arr2 = new int[2000][2000];
	populate(arr2);
	int find2 = topRight(arr2);
	int best2 = find2;
	int worst2 = find2 - 1;
	double time21 = System.currentTimeMillis();
	while (counter < 100000) {
	    search(arr2,best2);
	    counter++;
	}
	double time22 = System.currentTimeMillis();
	double timeBest2 = time22 - time21;
	counter = 0;
	double time23 = System.currentTimeMillis();
	while (counter < 100000) {
	    search(arr2,worst2);
	    counter++;
	}
	double time24 = System.currentTimeMillis();
	double timeWorst2 = time24 - time23;
	System.out.println("2000x2000: \nBest: " + timeBest2 +"\nWorst: "+ timeWorst2);

	System.out.println("=====================================");
	
	counter = 0;
	int[][] arr3 = new int[3000][3000];
	populate(arr3);
	int find3 = topRight(arr3);
	int best3 = find3;
	int worst3 = find3 - 1;
	double time31 = System.currentTimeMillis();
	while (counter < 100000) {
	    search(arr3,best3);
	    counter++;
	}
	double time32 = System.currentTimeMillis();
	double timeBest3 = time32 - time31;
	counter = 0;
	double time33 = System.currentTimeMillis();
	while (counter < 100000) {
	    search(arr3,worst3);
	    counter++;
	}
	double time34 = System.currentTimeMillis();
	double timeWorst3 = time34 - time33;
	System.out.println("3000x3000: \nBest: " + timeBest3 +"\nWorst: "+ timeWorst3);

	System.out.println("=====================================");
	
	counter = 0;
	int[][] arr4 = new int[4000][4000];
	populate(arr4);
	int find4 = topRight(arr4);
	int best4 = find4;
	int worst4 = find4 - 1;
	double time41 = System.currentTimeMillis();
	while (counter < 100000) {
	    search(arr4,best4);
	    counter++;
	}
	double time42 = System.currentTimeMillis();
	double timeBest4 = time42 - time41;
	counter = 0;
	double time43 = System.currentTimeMillis();
	while (counter < 100000) {
	    search(arr4,worst4);
	    counter++;
	}
	double time44 = System.currentTimeMillis();
	double timeWorst4 = time44 - time43;
	System.out.println("4000x4000: \nBest: " + timeBest4 +"\nWorst: "+ timeWorst4);

	System.out.println("=====================================");
	
	counter = 0;
	int[][] arr5 = new int[5000][5000];
	populate(arr5);
	int find5 = topRight(arr5);
	int best5 = find5;
	int worst5 = find5 - 1;
	double time51 = System.currentTimeMillis();
	while (counter < 100000) {
	    search(arr5,best5);
	    counter++;
	}
	double time52 = System.currentTimeMillis();
	double timeBest5 = time52 - time51;
	counter = 0;
	double time53 = System.currentTimeMillis();
	while (counter < 100000) {
	    search(arr5,worst5);
	    counter++;
	}
	double time54 = System.currentTimeMillis();
	double timeWorst5 = time54 - time53;
	System.out.println("5000x5000: \nBest: " + timeBest5 +"\nWorst: "+ timeWorst5);

	System.out.println("=====================================");
	
	counter = 0;
	int[][] arr6 = new int[6000][6000];
	populate(arr6);
	int find6 = topRight(arr6);
	int best6 = find6;
	int worst6 = find6 - 1;
	double time61 = System.currentTimeMillis();
	while (counter < 100000) {
	    search(arr6,best6);
	    counter++;
	}
	double time62 = System.currentTimeMillis();
	double timeBest6 = time62 - time61;
	counter = 0;
	double time63 = System.currentTimeMillis();
	while (counter < 100000) {
	    search(arr6,worst6);
	    counter++;
	}
	double time64 = System.currentTimeMillis();
	double timeWorst6 = time64 - time63;
	System.out.println("6000x6000: \nBest: " + timeBest6 +"\nWorst: "+ timeWorst6);

	System.out.println("=====================================");

	counter = 0;
	int[][] arr7 = new int[7000][7000];
	populate(arr7);
	int find7 = topRight(arr7);
	int best7 = find7;
	int worst7 = find7 - 1;
	double time71 = System.currentTimeMillis();
	while (counter < 100000) {
	    search(arr7,best7);
	    counter++;
	}
	double time72 = System.currentTimeMillis();
	double timeBest7 = time72 - time71;
	counter = 0;
	double time73 = System.currentTimeMillis();
	while (counter < 100000) {
	    search(arr7,worst7);
	    counter++;
	}
	double time74 = System.currentTimeMillis();
	double timeWorst7 = time74 - time73;
	System.out.println("7000x7000: \nBest: " + timeBest7 +"\nWorst: "+ timeWorst7);

	System.out.println("=====================================");

	counter = 0;
	int[][] arr8 = new int[8000][8000];
	populate(arr8);
	int find8 = topRight(arr8);
	int best8 = find8;
	int worst8 = find8 - 1;
	double time81 = System.currentTimeMillis();
	while (counter < 100000) {
	    search(arr8,best8);
	    counter++;
	}
	double time82 = System.currentTimeMillis();
	double timeBest8 = time82 - time81;
	counter = 0;
	double time83 = System.currentTimeMillis();
	while (counter < 100000) {
	    search(arr8,worst8);
	    counter++;
	}
	double time84 = System.currentTimeMillis();
	double timeWorst8 = time84 - time83;
	System.out.println("8000x8000: \nBest: " + timeBest8 +"\nWorst: "+ timeWorst8);

	System.out.println("=====================================");

	counter = 0;
	int[][] arr9 = new int[9000][9000];
	populate(arr9);
	int find9 = topRight(arr9);
	int best9 = find9;
	int worst9 = find9 - 1;
	double time91 = System.currentTimeMillis();
	while (counter < 100000) {
	    search(arr9,best9);
	    counter++;
	}
	double time92 = System.currentTimeMillis();
	double timeBest9 = time92 - time91;
	counter = 0;
	double time93 = System.currentTimeMillis();
	while (counter < 100000) {
	    search(arr9,worst9);
	    counter++;
	}
	double time94 = System.currentTimeMillis();
	double timeWorst9 = time94 - time93;
	System.out.println("9000x9000: \nBest: " + timeBest9 +"\nWorst: "+ timeWorst9);

	System.out.println("=====================================");
	counter = 0;
	int[][] arr10 = new int[10000][10000];
	populate(arr10);
	int find10 = topRight(arr10);
	int best10 = find10;
	int worst10 = find10 - 1;
	double time101 = System.currentTimeMillis();
	while (counter < 100000) {
	    search(arr10,best10);
	    counter++;
	}
	double time102 = System.currentTimeMillis();
	double timeBest10 = time102 - time101;
	counter = 0;
	double time103 = System.currentTimeMillis();
	while (counter < 100000) {
	    search(arr10,worst10);
	    counter++;
	}
	double time104 = System.currentTimeMillis();
	double timeWorst10 = time104 - time103;
	System.out.println("10000x10000: \nBest: " + timeBest10 +"\nWorst: "+ timeWorst10);
    } 
}
				
