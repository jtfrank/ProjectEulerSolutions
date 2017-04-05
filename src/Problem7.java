import java.util.ArrayList;

public class Problem7 {

	public static void main(String[] args) {
		int n = readAndParseInput(args);
		System.out.println("Starting");
		long nthPrime = getNthPrime(n);
		System.out.println("nth prime number: " + nthPrime);
	}
	
	public static int readAndParseInput(String[] userInput){
		if(userInput.length != 1){
			System.out.println("Usage: java Problem7 <integer>");
			System.exit(-1);
		}
		
		int parsedInput = 6;
		try{
			parsedInput = Integer.parseInt(userInput[0]);
		}
		catch(NumberFormatException nfe){
			System.out.println(nfe);
			System.out.println("Defaulting to 6");
		}
		
		return parsedInput;
	}
	
	public static long getNthPrime(int n){
		ArrayList<Long> listOfPrimes = new ArrayList<Long>();
		
		listOfPrimes.add((long)2);
		
		long curr = 3;
		int numberOfPrimes = 1;
		long mostRecentPrime = 2;
		
		while(numberOfPrimes < n){
			double currRoot = Math.sqrt(curr);
			for(Long test : listOfPrimes){
				if((curr % test) == 0){
					break;
				}
				if(test > currRoot){
					listOfPrimes.add(curr);
					mostRecentPrime = curr;
					numberOfPrimes++;
					System.out.println(numberOfPrimes);
					break;
				}
			}
			curr += 2;
		}
		
		return mostRecentPrime;
	}

}
