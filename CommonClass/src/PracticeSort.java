public class PracticeSort {
    public static void main(String[] args) {
        /*char[] cha={'d','c','g','e','b','a','f'};
        String str="dcgebaf";
        stringToCharSort(str);
        findSortChar(cha, 'g');*/
        System.out.println(recursiveMult(4,5));
    }
    public static void stringToCharSort(String str){
        char[]ch =str.toCharArray();
        bubbleSort(ch);
        String str2=String.valueOf(ch);
        System.out.println(str2);
    }
    public static void findSortChar(char[] ch,char target){
        bubbleSort(ch);
        int max=ch.length,min=0,index=(max+min)/2;
        for(int i=0;i<ch.length/2;i++){
            if(ch[index]==target){
                System.out.println("索引:"+index);
                return;
            }
            else if(ch[index]>target){
                max=index;
                index=(max+min)/2;
            }
            else if (ch[index]<target) {
                min=index;
                index=(max+min)/2;
            }
            else{
                System.out.println("找不到");
            }
            System.out.println(index);;
        }
    }
    public static void findChar(char[] ch,char target){
        for(int i=0;i<ch.length;i++){
            if(ch[i]==target){
                System.out.println("索引:"+i);
                return;
            }
        }
        System.out.println("找不到");
    }
    public static void bubbleSort(char[]str){
        for(int i=0;i<str.length;i++){
            for(int j=str.length-1;j>i;j--){
                if(str[j]<str[j-1]){
                    char tmp;
                    tmp=str[j];
                    str[j]=str[j-1];
                    str[j-1]=tmp;
                }
            }
        }
        printString(str);
    }
    public static void chooseSort(char[] str){
        for(int i=0;i<str.length-1;i++){
            for(int j=i+1;j<str.length;j++){
                
            if(str[i]>str[j]){
                char temp;
                temp=str[i];
                str[i]=str[j];
                str[j]=temp;
            }
            }
        }
        printString(str);
    }
    public static void printString(char[] str){
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]);
        }
        System.out.println();
    }
    public static int recursiveMult(int a,int b){
        if(a==0){
            return 0;
        }
        else {
            return b+recursiveMult(a-1,b);
        }
    }
}
