import java.util.Arrays;

public class Main extends ArrayFunctions {
    public static void main(String[] args) {
        int array1[]={1,2,3,4,5,6,7,8,9,10};
        int array2[];

//        System.out.println(array2[1]);
//
//        for (int i = 0; i< 10; i++) {
//            System.out.println(array1[i]);
//        }
//
//        System.out.println(array1.length);
//
//        int[] array3 = new int[5];


        createArray(5);

        //copy array method 1
        String[] apple = {"red", "yellow", "green"};
        String[] apple1 = new String[apple.length];
        System.arraycopy(apple, 0, apple1,0,apple.length);

        //copy array method 2
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers1 = Arrays.copyOf(numbers, numbers.length);

        //copy array method 3
        char[] characters ={'@','#','$'};
        char[] char2 = new char[characters.length];
         for(int i=0; i< characters.length;i++) {
             char2[i]=characters[i];
         }









    }



}








