public class Problem2 {
	public static void main(String[] args){
		// check for argument
		if(args.length != 1){
			System.out.println("Usage: Problem2 <number>");
			System.exit(1);
		}
		
		// set up vars
		int finalAnswer = 0;
		int upperBound = Integer.parseInt(args[0]);
		int a = 2;
		int b = 1;
		int c = 0;
		
		// interate and add
		for(a = 2; a < upperBound; a = b + c){
			if(a % 2 == 0){
				finalAnswer += a;
			}
			c = b;
			b = a;
		}
		
		System.out.println("finalAnswer = " + finalAnswer);
	}
}
