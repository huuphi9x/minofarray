public class minOfArray {
    public static void main(String[] args) {
        int[] number = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(number);
        System.out.printf("The smallest element in the array has position at %d",index);
    }

    public static int minValue(int[] array) {
        int min = array[0];
        int index = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i+1;
            }
        }
        return index;

    }
}
