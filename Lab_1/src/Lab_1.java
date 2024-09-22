import java.util.Random;
import static java.lang.Math.*;


public class Lab_1 {
    public static void print_array(double[][] array) {
        for (double[] i : array) {
            for (double j : i) System.out.printf("%.5f ", j);
            System.out.println();
        }
    }

    public static double expression_1(double x) {
        double up = cbrt(pow((double) 2/3/x, x));
        double down = pow( (double) 1/4 / pow(PI * ((double) 2/3 + x), 3), 3) - 0.25;
        return (double) round((up / down) * 100000) / 100000;
    }
    public static double expression_2(double x) {
        double result = atan( pow( E, cbrt(-acos( x/12 ) )));
        return (double) round(result * 100000) / 100000;
    }
    public static double expression_3(double x) {
        double result = pow( 0.25 / cos( (0.25-tan(x)) / cos(x)), 3);
        return (double) round(result * 100000) / 100000;
    }

    public static boolean contain_for_array (int[] array, int x) {
        for (int j : array) if (j == x) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] z = new int[11];
        int[] nums = new int[]{7,9,13,17,23};
        double[] x = new double[15];
        double[][] z1 = new double[11][15];
        Random rand = new Random();

        z[0] = 3;
        for (int i = 0; i < x.length; i++) {
            if (i < z.length && i > 0)  z[i] = z[i - 1] + 2;
            x[i] = rand.nextDouble(12) - 6;
        }

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 15; j++) {
                if (z[i] == 21) z1[i][j] = expression_1(x[j]);
                else if (contain_for_array(nums,z[i])) z1[i][j] = expression_2(x[j]);
                else z1[i][j] = expression_3(x[j]);
            }
        }
        print_array(z1);
    }
}

