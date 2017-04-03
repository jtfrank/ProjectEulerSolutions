public class Problem1 {
	public static void main(String[] args){
		// check for argument
		if(args.length != 1){
			System.out.println("Usage: Problem1 <number>");
			System.exit(1);
		}
		
		// set up vars
		int finalAnswer = 0;
		int upperBound = Integer.parseInt(args[0]);
		
		// interate and add
		for(int i = 0; i < upperBound; i++){
			if((i % 3 == 0) || (i % 5 == 0)){
				finalAnswer += i;
				continue;
			}
		}
		
		System.out.println("finalAnswer = " + finalAnswer);
	}
}
