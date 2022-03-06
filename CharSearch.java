package assign;

import java.util.*;

public class CharSearch {
	public static void main(String[] args) {
		Character arr[] = {'a','b','d','e','f','g','h','i','x','z'};
		char tr ='z';
		int left = 0;
		int right =arr.length -1;
		int fpos = -1;
		
		while(left <= right) {
			 int mid = (left + right)/2;
			 
			if(tr == arr[mid]) {
				fpos = mid;
				right = mid -1;
			}else if(tr < arr[mid]) {
				right = mid -1;
			}else {
				left = mid +1;
			}
			
		}
		
		
//		 Scanner sc = new Scanner(System.in);
//	        int cnt = sc.nextInt();
//	        int count = 0;
//	        boolean flag  = true;
//	        int temp = -1;
//	        int arr[] = new int[cnt];
//	        for(int i =0;i<cnt;i++){
//	            
//	            arr[i] = sc.nextInt(); 
//	            
//	            if(arr[i] == temp){
//	                count ++;
//	            }else{
//	                if(count == 3){
//	                    System.out.print("YES");
//	                    flag = false;
//	                    break;
//	                }
//		            if(temp != arr[i]){
//		                count =0;
//		            }
//	                count ++;
//	                
//	                temp = arr[i];
//	                
//	            }
//	        }
//	        if(flag) {
//	        	System.out.print("NO");
//	        }
	        		
	}
}
