public class chapter07 {
    public static void main(String[] args) {
        int number = 1;
        while (number < 5) {
            number *= 2;
            System.out.println(number);
        }

        int[] array = {1,4,14,24};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int val : array) {
            if (val % 2 == 0) {
                continue;
            }
            System.out.println(val);
        }
    }
}
