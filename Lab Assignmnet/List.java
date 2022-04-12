public class List {
    public static void main(String[] args){

        int[] array = {1,2,3,4,5}; // new int[5];

        append(array, 6);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void append(int[] array, int number) {
        int[] appendArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            appendArray[i] = array[i];
        } System.out.println("Copied");

        appendArray[array.length] = number;

        array = appendArray;
    }
}