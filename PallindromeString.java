public class PallindromeString {
	
	public boolean isPallindrome(int x) {
		if(x<0)
			return false;
		
		String str = Integer.toString(x);
		for(int i = 0;i<str.length()/2;i++) {
			if (str.charAt(i) != str.charAt(str.length()-1-i)){
				return false;
			}
		}
		return true;
	}
	
		public static void main(String[] args) {
			PallindromeString solver = new PallindromeString();
			int a = 121359;
			boolean result = solver.isPallindrome(a);
			System.out.println(result);
		}

    
}
