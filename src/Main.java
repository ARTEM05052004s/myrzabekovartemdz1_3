public class Main {
    public static void main(String[] args) {
        double[] artem = {1.4, 2.4, 3.3, 3.6, -1.7, 1.2, 1.8, 8.3, 7.8, 6.6, 3.4, 6.7, 5.5, 7.7, 8.9};
        for (int i = 0; i < artem.length; i++) {


            if (artem[i] < 0.1) ;

            continue;
        }double sum = 0;
            for (double x : artem) {
                sum = sum + x;
            }
            System.out.println();
            System.out.println(sum);


        }
    }
