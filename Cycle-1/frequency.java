class frequency { //the filename should be same as the class name
    public static void main (String[] args) {
        String Str = args[0];
        System.out.println("Given String is " + args[0]);
        char ch[]= Str.toCharArray();
        int []freq = new int[Str.length()];
        
        int i, j;
        for(i=0; i<Str.length(); i++){
            freq[i]=1;
            for(j=i+1; j<Str.length();j++){
                if(ch[i]==ch[j]){
                    freq[i]++;
                    ch[j]=0;
                }
            }
        }
        System.out.println("Character and their corresponding frequency : ");
        for(i=0; i<freq.length; i++){
            if(ch[i]!='\0' && ch[i]!='0'){
                System.out.println(ch[i] + "=" + freq[i]);
            }
        }
    }
}
