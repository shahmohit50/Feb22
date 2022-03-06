package assign;

public class FrequencySortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tr = 6;
		int arr[] = {1,1,2,2,4,5,5,6,6,6,6,9,10,11};
		int left =0;
		int right = arr.length -1;
		int fpos = -1 ,lpos = -1;
		
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
		 left =0;
		 right = arr.length -1;
		while(left <= right) {
			 int mid = (left + right)/2;
			 
			if(tr == arr[mid]) {
				lpos = mid;
				left = mid +1;
			}else if(tr < arr[mid]) {
				right = mid -1;
			}else {
				left = mid +1;
			}
			
		}
	
	System.out.println("Frequency for Target "+tr+" is :"+(lpos-fpos+1));
	}

}
