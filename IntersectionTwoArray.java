package assign;

import java.util.*;
public class IntersectionTwoArray {

	    public int[] intersection(int[] nums1, int[] nums2) {
	         ArrayList<Integer> res = new ArrayList<Integer>();
	        for(int i =0; i< nums1.length;i++){
	           for(int j=0;j<nums2.length;j++){
	               if(nums1[i] == nums2[j] && !res.contains(nums1[i])){
	                   res.add(nums1[i]);
	               }
	           }
	        }
	        int result[] = new int[res.size()];
	        int indx = 0;
	        for(int nums : res){
	            result[indx] = nums;
	            indx++;
	        }
	       return result; 
	    }
	}

