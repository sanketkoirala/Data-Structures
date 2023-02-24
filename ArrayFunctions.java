public class ArrayFunctions {

    public static void printArray(int[] nameArray) {
        for (int i = 0; i < nameArray.length; i++) {
            System.out.println(nameArray[i]);
        }
    }

    public static int[] fillArray(int[] nameArray) {
        for (int i = 0; i < nameArray.length; i++) {
            nameArray[i] = i * 3;
        }
        return nameArray;
    }

    public static int[] createArray(int size) {
        int[] nameArray = new int[size];
        return nameArray;
    }
}
