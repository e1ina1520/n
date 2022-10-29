

public class Main {
    public static int pozitivenumbere;
    public static int getNumbere;
    public static boolean issojiodf = false;

    public static void main(String[] arge) {

        double[] sun = {1.1, -2.2, 3.3, 4.4, 5.5, -6.6, 7.7, -8.8, 9.9, 10.10, 11.11, -12.12, 13.13, 14.14, 15.15};

        for (double number : sun) {
            if (number < 0) {
                issojiodf = true;
            }
            if (issojiodf) {
                if (number > 0) {
                    pozitivenumbere++;
                    getNumbere += number;
                }
            }
        }
        System.out.println( getNumbere / pozitivenumbere );
    }
}