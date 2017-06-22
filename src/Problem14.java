import java.util.ArrayList;

public class Problem14 {

	public static void main(String[] args) {
		long maxInt = 1000000;
		long longestLength = 1;
		long seedOfLongest = 1;
		
		ArrayList<Long> collatzMasterList = new ArrayList<Long>();
		
		for(long i = 1; i < maxInt; i++){
			long collatzLength = 0;
			long n = i;
			
			while(n >= i && n > 1){
				if(n % 2 == 0){
					n /= 2;
					collatzLength++;
				}
				else{
					n = (3*n) + 1;
					collatzLength++;
				}
			}
			collatzLength += 1;
			if(n != 1) collatzLength += collatzMasterList.get((int)n-1) - 1;
			
			collatzMasterList.add(collatzLength);
			
			if(collatzLength > longestLength){
				longestLength = collatzLength;
				seedOfLongest = i;
			}
		}
		
		System.out.println(seedOfLongest + " :: " + longestLength);
	}

}
