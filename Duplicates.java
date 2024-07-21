import java.util.Arrays;

public class Duplicates {	
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		 
		for(int i = 1;i< nums.length;i++) {
			if(nums[i] == nums[i-1]) {
				return true;
			}
		}
		return false;
	}
		
	public static void main(String[] args) {
		Duplicates solver = new Duplicates();
		int [] a = {1,2,3,4,8};
		boolean result = solver.containsDuplicate(a);
		
		if (result == true) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
