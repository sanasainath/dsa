class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int[] res = new int[queries.length];
        int prefix[] = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            if (str.length() == 1 && set.contains(str.charAt(0))) {

                if (i == 0) {
                    prefix[i] = 1;
                } else {
                    prefix[i] = prefix[i - 1] + 1;
                }

            } else {
                char first = str.charAt(0);
                char second = str.charAt(str.length() - 1);
                if (set.contains(first) && set.contains(second)) {

                    if (i == 0) {
                        prefix[i] = 1;
                    } else {
                        prefix[i] = prefix[i - 1] + 1;
                    }
                }
                else
                {
                    if(i>0)
                    {
                   prefix[i]=prefix[i]+prefix[i-1];
                    }
                  
                }

            }
        }
        for (int i = 0; i < queries.length; i++) {
            if (queries[i][0] == queries[i][1]) {
                String ss = words[queries[i][1]];
                if (set.contains(ss.charAt(0)) && set.contains(ss.charAt(ss.length() - 1))) {
                    res[i] = 1;
                } else {
                    res[i] = 0;
                }
            } else {
                res[i] = prefix[queries[i][1]] - prefix[queries[i][0]];
                String ss = words[queries[i][0]];
                if (set.contains(ss.charAt(0)) && set.contains(ss.charAt(ss.length() - 1))) {
                    res[i]=res[i]+1;
                }

            }
        }
        return res;

    }
}