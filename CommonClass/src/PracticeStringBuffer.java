import java.util.*;
public class PracticeStringBuffer {
    public static void main(String[] args){
        StringBuffer StrB=new StringBuffer();
        int[] arr={1,3,5,4,8};
        for(int i=0;i<arr.length;i++){
            StrB.append(arr[i]);
        }
        System.out.println(StrB);
        
        StrB.reverse();
        System.out.println(StrB);
        Scanner sc =new Scanner(System.in);
        String s1=sc.nextLine();
        StrB.delete(0, StrB.length());
        sc.close();
        StrB.append(s1);
        if(StrB.reverse().toString().equals(s1)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
/*import java.util.*;
public class PracticeStringBuffer {
    public static void main(String[] args){
        StringBuffer StrB=new StringBuffer();
        int[] arr={1,3,5,4,8};
        for(int i=0;i<arr.length;i++){
            StrB.append(arr[i]);
        }
        System.out.println(StrB);
        StrB.reverse();
        System.out.println(StrB);
        Scanner sc =new Scanner(System.in);
        StrB.delete(0, StrB.length());
        String s1=sc.nextLine();
        StrB.append(s1);
        String s2=new String(StrB.reverse());
        if(s2.equals(s1)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
 */