public class PallindromeNumber {
	public boolean isPallindrome(int x) {
		if(x<0 || (x != 0 && x % 10 ==0) ) 
			return false;
		
		int num=x;
		int y=0;
		
		while(num != 0) {
		int rem = num%10;
		num = num/10;
		y = y * 10 + rem;
		}
		return true;
	}

	public static void main(String[] args) {
		int x = 12121;

		PallindromeNumber solver = new PallindromeNumber();
		boolean result = solver.isPallindrome(x);
		System.out.println(result);
		}
	

    
}
