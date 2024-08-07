class Solution {
    static String[] single = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static String[] doub = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    
    String convertToWords(long n) {
        if (n == 0) {
            return "zero";
        }
        String res = "";
        res += path((int)(n / 10000000), "crore ");
        res += path((int)((n / 100000) % 100), "lakh ");
        res += path((int)((n / 1000) % 100), "thousand ");
        res += path((int)((n / 100) % 10), "hundred ");
        
        if (n > 100 && n % 100 != 0) {
            res += "and ";
        }
        
        res += path((int)(n % 100), "");
        return res.trim();
    }

    public static String path(int n, String str) {
        String res = "";
        if (n > 19) {
            res += doub[n / 10] + " " + single[n % 10];
        } else {
            res += single[n];
        }

        if (n != 0) {
            res += " " + str;
        }
        
        return res;
    }

   
}
