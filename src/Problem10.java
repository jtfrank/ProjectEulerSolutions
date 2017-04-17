import java.util.ArrayList;

public class Problem10 {

	public static void main(String[] args) {
		int primeCeiling = readAndParseInput(args);
		
		if(primeCeiling < 2){
			System.out.println("No primes below 2");
			System.exit(0);
		}
		long sumOfPrimes = 2;
		
		Integer curr = 3;
		ArrayList<Integer> listOfPrimes = new ArrayList<Integer>();
		listOfPrimes.add(2);

		while(curr <= primeCeiling){
			double currRoot = Math.sqrt(curr);
			for(Integer test : listOfPrimes){
				if((curr % test) == 0){
					break;
				}
				if(test > currRoot){
					listOfPrimes.add(curr);
					sumOfPrimes += curr;
					break;
				}
			}
			curr++;
		}
		
		System.out.println(sumOfPrimes);
	}
	
	public static int readAndParseInput(String[] userInput){
		if(userInput.length != 1){
			System.out.println("Usage: java Problem8 <integer>");
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

}
