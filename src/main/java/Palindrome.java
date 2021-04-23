public class Palindrome {

    public boolean isPalindrome(String str){

        str = str.trim();
        if (str == null){
            throw new NullPointerException();
        }
        if(str.isEmpty()){
            return false;
        }
        String rev = "";
        for(int i=0; i<=str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
            //rev += str.charAt(i);
        }
        return true ;
    }
}
