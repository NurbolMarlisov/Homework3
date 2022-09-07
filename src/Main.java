public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double[] nambers = {-4.2, 3.3, 1.6, -8.8, 2.3, 4.2, -16.7, 2.2, -14.1, 6.2, 2.1, -48.3, 5.6, -66.2, -88, 4};
        double lang = 0;
        int reac = 0;
        boolean bool = false;
        for (double f : nambers) {
            if (f < 0) {
                bool = true;
            } else if (bool) {
                reac++;
                lang += f;
            }
        }
        System.out.println(lang / reac);
    }
}