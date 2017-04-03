
public class Problem4 {

	public static void main(String[] args) {
		int lengthOfFactors = checkAndParseUserInput(args);
		int largestFactor = setLargestFactor(lengthOfFactors);
		int largestPalindrome = 0;
		for(int i = largestFactor; i > 0; i--){
			for(int j = largestFactor; j > 0; j--){
				int potentialPalindrome = i * j;
				if(checkIfPalindrome(potentialPalindrome)){
					if(potentialPalindrome > largestPalindrome){
						largestPalindrome = potentialPalindrome;
					}
				}
			}
		}
		System.out.println(largestPalindrome);
	}
	
	public static int checkAndParseUserInput(String[] userInput){
		if(userInput.length != 1){
			System.out.println("Usage: java Problem4 <integer>");
			System.exit(-1);
		}
		
		int parsedInput = 2;
		try{
			parsedInput = Integer.parseInt(userInput[0]);
		}
		catch(NumberFormatException nfe){
			System.out.println(nfe);
			System.out.println("Defaulting to 2");
		}
		
		return parsedInput;
	}
	
	public static int setLargestFactor(int lengthOfFactor){
		int largestFactor = 0;
		int multiple = 1;
		
		for(int i = 0; i < lengthOfFactor; i++){
			largestFactor += multiple * 9;
			multiple *= 10;
		}
		
		return largestFactor;
	}
	
	public static boolean checkIfPalindrome(int potentialPalindrome){
		String potentialPalindromeForward = Integer.toString(potentialPalindrome);
		String potentialPalindromeReverse = new StringBuilder(potentialPalindromeForward).reverse().toString();
		return (potentialPalindromeForward.compareTo(potentialPalindromeReverse) == 0) ? true : false;
	}

}
