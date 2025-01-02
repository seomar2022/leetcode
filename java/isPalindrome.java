class isPalindrome {
    public boolean isPalindrome(int x) {
        long reversedNum=0;
        long copyX = (long)x;
        if(x<0){
            return false;
        }else if(x==0){
            return true;
        }
        else{
            int digits = (int)Math.log10(x);
            for(int i = digits; i>=0; i--){
                reversedNum += (long) (copyX / Math.pow(10, i)) * (Math.pow(10, digits-i));
                copyX = (long) (copyX % Math.pow(10, i));
            }

            if(reversedNum == x){
                return true;
            }
            return false;
        }

    }
}