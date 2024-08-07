class Solution {
    static String single[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    static String doub[]={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    public String numberToWords(int num) {
        
        if(num==0)
        {
            return "Zero";
        }
        String res="";
        res+=path(num/1000000000,"Billion ");
        res+=path((num/1000000)%1000,"Million ");
        res+=path((num/1000)%1000,"Thousand ");
        res+=path((num/100)%10,"Hundred ");
        res+=path(num%100,"");
        return res.trim();

    }
    public static String path(int n,String str)
    {
        String res="";
        if(n>99)
        {
            res+=single[n/100]+" "+"Hundred";
            if(n%100!=0)
            {
                int xx=n%100;
                if(xx>19)
                {
                if(xx%10!=0&&xx/10!=0)
                {
                    res+=" "+doub[(xx/10)]+" "+single[xx%10];
                }
                else if(xx%10!=0&&xx/10==0)
                {
                    res+=doub[(xx/10)]+" "+single[xx%10];

                }
                else if(xx%10==0&&xx/10!=0)
                {
                    res+=" "+doub[(xx/10)]+single[xx%10];
                }
                }
                else
                {
                    res+=" "+single[xx];
                }
                
                
            }

        }
        else if(n>19)
        {
            if(n%10!=0)
            {
               res+=doub[n/10]+" "+single[n%10];
            }else
            {
                 res+=doub[n/10]+single[n%10];
            }
           

        }
        else
        {
            res+=single[n];
        }
        if(n!=0)
        {
            res+=" "+str;
        }
        return res;
    }
}