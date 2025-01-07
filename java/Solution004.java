class Solution004 {
    public String longestCommonPrefix(String[] strs) {

        int prefixIndex = 0;

        int shortest = 200;
        for(String str: strs){
            if(str.length() <shortest){
                shortest = str.length();
            }
        }
        while (prefixIndex < shortest) {
            for (int i = 0; i < strs.length - 1; i++) {
                if (strs[i].charAt(prefixIndex) != strs[i + 1].charAt(prefixIndex)) {
                    return strs[0].substring(0, prefixIndex);
                }
            }
            prefixIndex++;


        }
        return strs[0].substring(0, prefixIndex);
    }

}