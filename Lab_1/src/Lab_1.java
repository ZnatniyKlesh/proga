import java.util.Random;


public class Lab_1 {
    public static double expression_1(double x) {
        double up = Math.cbrt(Math.pow((double) 2/3/x, x));
        double down = Math.pow( (double) 1/4 / Math.pow(Math.PI * ((double) 2/3 + x), 3), 3) - 0.25;
        return (double) Math.round((up / down) * 100000) / 100000;
    }
    public static double expression_2(double x) {
        double result = Math.atan( Math.pow( Math.E, Math.cbrt(-Math.acos( x/12 ) )));
        return (double) Math.round(result * 100000) / 100000;
    }
    public static double expression_3(double x) {
        double result = Math.pow( 0.25 / Math.cos( (0.25-Math.tan(x)) / Math.cos(x)), 3);
        return (double) Math.round(result * 100000) / 100000;
    }

    public static boolean contain_for_array (int[] array, int x) {
        for (int j : array) if (j == x) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] s = new int[11];
        int[] nums = new int[]{7,9,13,17,23};
        double[] x = new double[15];
        double[][] w = new double[11][15];
        Random rand = new Random();

        s[0] = 3;
        for (int i = 0; i < x.length; i++) {
            if (i < s.length && i > 0)  s[i] = s[i - 1] + 2;
            x[i] = rand.nextDouble(12) - 6;
        }

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 15; j++) {
                if (s[i] == 21) w[i][j] = expression_1(x[j]);
                else if (contain_for_array(nums,s[i])) w[i][j] = expression_2(x[j]);
                else w[i][j] = expression_3(x[j]);
                System.out.print(w[i][j] + " ");
            }
            
        }
    }
}

