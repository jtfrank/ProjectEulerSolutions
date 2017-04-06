
public class Problem9 {

	public static void main(String[] args) {
		int a = 1, b = 2, c;
		boolean stop = false;
		
		for(a = 1; a < 1000; a++){
			for(b = a + 1; b <= 1000; b++){
				if(Math.sqrt(a*a + b*b) + a + b == 1000){
					stop = true;
					break;
				}
			}
			if(stop){
				break;
			}
		}
		
		c = (int)Math.sqrt(a*a + b*b); 
		System.out.println("a: " + a + " b: " + b + " c: " + c);
		System.out.println(a*b*c);
	}

}
