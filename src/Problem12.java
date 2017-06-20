
public class Problem12 {

	public static void main(String[] args) {
		int numFactors = 0;
		int i = 1;
		int testNum = 0;
		for(i = 1; numFactors <= 500; i++){
			if((numFactors = numTriangleFactors(testNum)) > 500){
				break;
			}
			testNum += i;
		}
		
		System.out.println(testNum);
	}
	
	static int numTriangleFactors(int testNum){
		int numFactors = 0;
		double testNumRoot = Math.sqrt(testNum);
		
		for(int i = 1; i < testNumRoot; i++){
			if((testNum % i) == 0){
				numFactors += 2;
			}
		}
		
		return numFactors;
	}

}
