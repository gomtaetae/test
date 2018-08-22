package spring.test;

import java.util.List;

public class Nums {
	private List<Integer> nums;
	
	public Nums(List<Integer> nums){
		this.nums = nums;
	}
	
	public int getGreatest(){
		int max = 0;
		for(int i:nums)
			if(i>max) max = i;
		return max;
	}
}
