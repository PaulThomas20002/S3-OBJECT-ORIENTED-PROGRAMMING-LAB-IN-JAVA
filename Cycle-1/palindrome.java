/*command line arguement type*/

class palindrome{
    
    public static void main(String [] args){
        String Str = args[0];
        String rev = "";
        int length = Str.length();
        for(int i=length-1; i>=0; i--){
            rev = rev + Str.charAt(i);
        }
        System.out.println("Reversed String is " + rev);
        
        if(Str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
