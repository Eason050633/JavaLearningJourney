import java.util.Scanner;
import java.util.regex.*;
public class practiceRegax {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        System.out.println(splitString(s));
        String str="hellowodekahaoshi62212934564347892nikyidaqiangeiwoxiexie13212345678gaowoyishen";
        System.out.println(replacenum(str,"***"));
        Scanner sc=new Scanner(System.in);
        String ss=sc.nextLine();
        sc.close();
        System.out.println(checkPassword(ss));
        String sss="1231515";
        System.out.println(patternMatch(sss));
    }
    public static String replacenum(String str ,String replacenum){
       String str2= str.replaceAll("\\d+",replacenum);
        return str2;
    }
    public static boolean patternMatch(String sss){
        Pattern p=Pattern .compile("[1-9][0-9]{4,14}");
        Matcher m=p.matcher(sss);
        boolean b=m.matches();
        return b;
    } 
    public static boolean checkPassword(String str)
    {
        return str.matches("[1-9][0-9]{4,14}");
    }
    public static StringBuffer splitString(String str){
        String[] strArray=str.split(" ");
        int[] intarray=new int[strArray.length];
        for(int k=0;k<strArray.length;k++){
            intarray[k]=Integer.parseInt(strArray[k]);
        }
        for(int i=0;i<intarray.length;i++){
            for(int j=intarray.length-1;j>i;j--){
                if(intarray[j]<intarray[j-1]){
                    int tmp=intarray[j];
                    intarray[j]=intarray[j-1];
                    intarray[j-1]=tmp;
                }
            }
        }
        StringBuffer stringBuffer=new StringBuffer();
            for(int l=0;l<intarray.length;l++){
                stringBuffer.append(String.valueOf(intarray[l])+" ");
            }
        return stringBuffer;
    }
}
