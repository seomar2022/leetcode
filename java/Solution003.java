import java.util.HashMap;
//https://leetcode.com/problems/roman-to-integer/description/

class Solution003 {
    public int romanToInt(String s) {
        int answere = 0;
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        if(s.contains("IV")){
            answere -=2;
        }
        if(s.contains("IX")){
            answere -=2;
        }
        if(s.contains("XL")){
            answere -=20;
        }
        if(s.contains("XC")){
            answere -=20;
        }
        if(s.contains("CD")){
            answere -=200;
        }
        if(s.contains("CM")){
            answere -=200;
        }



        for(char c : s.toCharArray()){
            answere += roman.get(c);
        }

        return answere;

    }
}