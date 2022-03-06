package assign;

public class SortColor {
	 public void sortColors(int[] nums) {
	        int c = nums.length;
	        
	        for(int i=0;i<c -1;i++){
	             int min_idx = i;
	            for(int j=i+1; j<c;j++){
	                if(nums[j] < nums[min_idx]) {
	                    min_idx = j;
	                }
	                
	            }
	         
	           int temp = nums[i];
	           nums[i] = nums[min_idx];
	           nums[min_idx] = temp;
	         
	        }
	              
 }
}
