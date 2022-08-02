package Trainning1;

import java.util.Arrays;

public class T1 {
    public static void main(String[] args) {
        // T1
       String array[]={"saleh" , "khalid" , "majed"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
             }
        //T2
        for (int i = 1; i <= 33; i++) {

            if (i%5==0){
                continue;
            }
            System.out.println(i);
        }

        //T3
        String array2[]={"shahad", "nor", "farah", "haya", "fay"};
        for (int i = 4; i >=0 ; i--) {
            System.out.println(array2[i]);
        }

        //T4
        String array3[]={"Ali", "naser", "fahad", "hatem", "fares"};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i].charAt(0)=='A'){
                continue;
            }
            System.out.println(array3[i]);
        }
      //T5
        System.out.println("Training 5\n");
        int array4[]={13,24,16,30};
        PrintArray(array4);

        //T6
        System.out.println("Training 6\n");
       int ar[]= TakingNum(16,13,18);
        System.out.println(Arrays.toString(ar));

        //T7
        System.out.println("Training 7\n");
        Message("shahad","alsager");
        //T8
        System.out.println("Training 8\n");
       int avreg = average(33,55,77,22);
        System.out.println(avreg);
        //T9
        System.out.println("Training 9\n");
        BiggestNumber(array4);
    }
    public static void PrintArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
    public static int[] TakingNum(int a, int b , int c){
        int num []={a,b,c};
        return num;
    }
    public static void Message (String Fname,String Lname) {
       System.out.println("hello  "+Fname+" " + Lname );
    }
    public static int average (int a, int b, int c , int d){
        int s = (a+ b + c+ d)/4;
        return s;
    }
   public static int BiggestNumber(int array[]){
        int e= 0 ;
       for (int i = 0; i < array.length; i++) {

               if (array[i] > e) {
                   e=array[i];
               } }
       System.out.println(e);
   return e ; }
}
