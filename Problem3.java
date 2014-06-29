import java.util.*;

public class Problem3{
	public static void main(String[] args){
		if(args.length != 1){
			System.out.println("Usage: Problem3 <number>");
			System.exit(1);
		}
		
		// define some vars
		long checkNumber = Long.parseLong(args[0]);
		long origNumber = checkNumber;
		if(checkNumber < 1){
			System.out.println("number must be greater than 0");
			System.exit(1);
		}
		
		// initialize prime list
		List<Long> primes = new ArrayList<Long>();
		primes.add((long)1);
		
		// list to hold prime factor of checkNumber
		List<Long> primeFactors = new ArrayList<Long>();
		
		// part of this problem is that we need to build the primes list each
		// time we run the program
		
		for(long i = 2; i <= checkNumber; i++){
			boolean isPrime = true;
			for(Long x : primes){
				if(x == 1) continue;
				if(i % x == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				primes.add(i);
				while(checkNumber % i == 0){
					primeFactors.add(i);
					checkNumber /= i;
				}
			}
		}
		
		System.out.print("Prime factors of " + origNumber + ": ");
		for(Long x : primeFactors){
			System.out.print(x + ", ");
		}
		System.out.println();
	}
}
