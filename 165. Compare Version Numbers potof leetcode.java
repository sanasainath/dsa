class Solution {
    public int compareVersion(String version1, String version2) {
       int left=0;
       int right=0;
     String []arr=version1.split("\\.");
     String []arr1=version2.split("\\.");
     while(left<arr.length&&right<arr1.length)
     {
    
   String str1 = arr[left].replaceFirst("^0*(?=\\d)", "");

  String str2 = arr1[right].replaceFirst("^0*(?=\\d)", "");


    
        int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);

            if (num1 > num2) {
                return 1;
            } else if (num1 < num2) {
                return -1;
            }
      
        left++;
        right++;
     }
     while(left<arr.length)
     {

        if(Integer.parseInt(arr[left])>0)
        {

  return 1;
        }
        left++;
     }
       while(right<arr1.length)
     {
       
        if(Integer.parseInt(arr1[right])>0)
        {

  return -1;
        }
        right++;
     }
     return 0;

        
    }
}