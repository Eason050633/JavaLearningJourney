import java.util.Arrays;
public class PracticeString {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        intToString(arr);
        char[] s2={'a','b','c'};
        reverses(s2);
        String s4="woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        String s5="java";
        findJava(s4, s5);
        compare(s4, s5);
    }
    public static void compare(String s1,String s2){
        if(s1.length()==s2.length()){
            char[] ch1=s1.toCharArray();
            char[] ch2 =s2.toCharArray();
            for(int i=0;i<s1.length();i++){
                if(ch1[i]!=ch2[i]){
                    System.out.println("false");
                    return;
                }
            }
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static void reverses(char[] ca ){
        String st=new String();
        for(int i=ca.length-1;i>=0;i--){
            st+=ca[i];
        }
        System.out.println(st);
    }
    public static void intToString(int [] arr){
        String s =Arrays.toString(arr);
        System.out.println(s);;
    }
    public static void findJava(String word,String target ){
        
        int index=0;
        int count=0;
        while(index<word.length()){
            index+=word.indexOf(target,index);
            count++;
        }
        System.out.println(count);
    }
}

