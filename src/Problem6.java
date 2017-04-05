
public class Problem6 {

	public static void main(String[] args) {
		int maxNumber = readAndParseInput(args);
		long sumOfSquares = findSumOfSquares(maxNumber);
		long squareOfSum = findSquareOfSum(maxNumber);
		System.out.println(squareOfSum - sumOfSquares);
	}
	
	public static int readAndParseInput(String[] userInput){
		if(userInput.length != 1){
			System.out.println("Usage: java Problem6 <integer>");
			System.exit(-1);
		}
		
		int parsedInput = 10;
		try{
			parsedInput = Integer.parseInt(userInput[0]);
		}
		catch(NumberFormatException nfe){
			System.out.println(nfe);
			System.out.println("Defaulting to 10");
		}
		
		return parsedInput;
	}
	
	public static long findSumOfSquares(int maxNumber){
		long sumOfSquares = 0;
		
		for(int i = 1; i <= maxNumber; i++){
			sumOfSquares += i*i;
		}
		
		return sumOfSquares;
	}
	
	public static long findSquareOfSum(int maxNumber){
		long sum =  (maxNumber * (maxNumber+1))/2;
		return sum*sum;
	}

}
