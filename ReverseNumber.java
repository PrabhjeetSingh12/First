public class ReverseNumber {
	
	public int reverse(int x) {
		long output = 0 ;
		boolean negative = false;
		
		if(x<0) {
			x = x * -1;
			negative = true;
		}
		
		while (x >0) {
			output = 10 * output + (x%10);
			x = x/10;
		}
		
		if(output >Integer.MAX_VALUE) return 0;
		if(negative) {
			return(int) output* -1;
		}
		return (int) output;
	}
			

    
}
