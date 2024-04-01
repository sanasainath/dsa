import java.util.*;
public class Solution {

	public static int kDistinctChars(int k, String str) {
		// Write your code here	
		int n=str.length();
		int left=0;
		int maxi=0;
		HashMap<Character,Integer>mapp=new HashMap<>();
		for(int right=0;right<n;right++)
		{
			mapp.put(str.charAt(right),mapp.getOrDefault(str.charAt(right),0)+1);
			if(mapp.size()>k)
			{
				int freq=mapp.get(str.charAt(left));
				if(freq>1)
				{
					mapp.put(str.charAt(left),freq-1);
				}
				else{
					mapp.remove(str.charAt(left));
				}
				left++;
			}
			maxi=Math.max(maxi,right-left+1);
		}
		return maxi;
	}

}
