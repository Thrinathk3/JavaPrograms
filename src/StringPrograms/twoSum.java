package StringPrograms;

import java.util.Scanner;

public class twoSum {
	    public int[] twoSums(int[] nums, int target) {
	        
	         for (int i=0;i<nums.length;i++){
	             for (int j =i+1;j<nums.length;j++){
	                 if(nums[i]+nums[j]==target){
	                     return new int[] {i,j};
	                  }
	             }
	         }
	         return new int [] {};
	    }
	    public static void main(String[] args){
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter Array length:");
	        int l = input.nextInt();
	        int [] n = new int[l];
	        System.out.println("Enter array numbers:");
	        for(int i =0;i<l;i++){
	            n[i]=input.nextInt();
	        }
	        System.out.println("Enter target number:");
	        int target = input.nextInt();
	        input.close();
	        
	        twoSum in = new twoSum();
	        int[] indices=in.twoSums(n,target);

	        if(indices.length == 2){
	                System.out.println("Indices are: "+indices[0]+","+indices[1]);
	        }else{
	            System.out.println("No solution found");
	        }
	    }
}
