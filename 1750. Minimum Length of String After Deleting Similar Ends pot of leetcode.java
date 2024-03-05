class Solution {
    public int minimumLength(String s) {
    int start=0;
    int end=s.length()-1;
    while(start<end&&s.charAt(start)==s.charAt(end))
    {
        char x=s.charAt(start);
        while(start<=end&&s.charAt(start)==x)
        {
            start++;
        }
        while(start<=end&&s.charAt(end)==x)
        {
            end--;
        }
    }
    return end-start+1;
    }
}
