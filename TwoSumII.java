package assign;

public class TwoSumII {

	    public int[] twoSum(int[] numbers, int target) {
	        int i=0,j=0;
	        boolean flag = false;
	        for(i=0 ;i<numbers.length;i++){
	            for(j= i+1; j< numbers.length;j++){
	                if(numbers[i] + numbers[j] == target){
	                    flag = true;
	                    break;
	                }
	               
	            }
	             if(flag){
	                    break;
	                }
	        }
	        
	        int arr[] =  new int[2];
	        arr[0] = i+1;
	        arr[1] = j+1;
	        return arr;
	    }
	}

