import java.util.*;

public class Problem5 {

	public static void main(String[] args) {
		int maxNumber = readAndParseInput(args);
		
		ArrayList<Integer> primesBelowMax = getListOfPrimesBelowMaxNumber(maxNumber);
		
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		for(int i = maxNumber; i > 1; i--){
			ArrayList<Integer> currPrimeFactors = getPrimeFactors(i, primesBelowMax);
			primeFactors = consolidatePrimeFactors(primeFactors, currPrimeFactors);
		}
		
		long smallestMultiple = 1;
		for(Integer curr: primeFactors){
			smallestMultiple *= curr;
		}
		System.out.println(smallestMultiple);
	}
	
	public static int readAndParseInput(String[] userInput){
		if(userInput.length != 1){
			System.out.println("Usage: java Problem5 <integer>");
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
	
	public static ArrayList<Integer> getListOfPrimesBelowMaxNumber(int maxNumber){
		ArrayList<Integer> listOfPrimes = new ArrayList<Integer>();
		
		listOfPrimes.add(2);
		
		int curr = 3;
		
		while(curr <= maxNumber){
			double currRoot = Math.sqrt(curr);
			for(Integer test : listOfPrimes){
				if((curr % test) == 0){
					break;
				}
				if(test > currRoot){
					listOfPrimes.add(curr);
					break;
				}
			}
			curr++;
		}
		
		return listOfPrimes;
	}
	
	public static ArrayList<Integer> getPrimeFactors(int numberToFactor, ArrayList<Integer> allPrimes){
		ArrayList<Integer> theFactors = new ArrayList<Integer>();
		
		for(Integer test : allPrimes){
			if(test > numberToFactor) break;
			while(numberToFactor % test == 0){
				theFactors.add(test);
				numberToFactor /= test;
			}
		}
		
		return theFactors;
	}
	
	public static ArrayList<Integer> consolidatePrimeFactors(ArrayList<Integer> masterList, ArrayList<Integer> newList){
		ArrayList<Integer> consolidatedList = new ArrayList<Integer>();
		
		for(Integer test : newList){
			if(masterList.contains(test)){
				masterList.remove(test);
			}
			consolidatedList.add(test);
		}
		
		for(Integer curr : masterList){
			consolidatedList.add(curr);
		}
		
		return consolidatedList;
	}

}
