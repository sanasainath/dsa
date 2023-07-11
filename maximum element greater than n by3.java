import java.util.*;
public class Solution {
    public static List< Integer > majorityElement(int []v) {
        // Write your code here
int count1=0;
int count2=0;
int ele1=Integer.MIN_VALUE;
int ele2=Integer.MIN_VALUE;
for(int i=0;i<v.length;i++)
{
    if(count1==0&&ele2!=v[i])
    {
        count1=1;
        ele1=v[i];
    }
    else if(count2==0&&ele1!=v[i])
    {
        count2=1;
        ele2=v[i];
    }
    else if(v[i]==ele1)
    {
        count1++;
    }
    else if(v[i]==ele2)
    {
        count2++;

    }
    else{
        count1--;
        count2--;
    }
}
List<Integer>li=new ArrayList<>();
int co1=0;
int co2=0;
for(int i=0;i<v.length;i++)
{
    if(ele1==v[i])
    {
        co1++;
    }
    if(ele2==v[i])
    {
        co2++;
    }
}
int mini=(int)(v.length/3);
if(co1>mini)
{
    li.add(ele1);
}
if(co2>mini)
{
    li.add(ele2);
}
return li;
        
    }
}