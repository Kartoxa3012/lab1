//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] s = new int[] {19,17,15,13,11,9,7,5,3};
        float[] x = new float[12];
        for (int i = 0; i < x.length; i++){
            x[i] = ((float)Math.random()*21) - 9;
        }
        double[][] s1 = new double[9][12];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < x.length; j++) {
                switch (s[i]){
                    case 15:
                        s1[i][j] = function1(x[j]);
                        break;
                    case 3, 7, 11, 13:
                        s1[i][j] = function2(x[j]);
                        break;
                    case 5, 9, 17, 19:
                        s1[i][j] = function3(x[j]);
                        break;
                }
            }
        }
        function4(s1);

    }
    public static double function1(float x1) {
        double x2 = (double) x1;
        return Math.cos(Math.asin(1 / Math.exp(x2)));
    }
    public static double function2(float x1) {
        double x2 = (double) x1;
        return Math.exp(3 / (Math.pow(x2, ((x2 + 3) / x2))));
    }
    public static double function3(float x1) {
        double x2 = (double) x1;
        return Math.atan(Math.cos(Math.asin(Math.pow(Math.exp(- Math.abs(x2)), 2))));
    }
    public static void function4(double[][] p1) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("%10.4f\t", p1[i][j]);
            }
            System.out.println(" ");
        }
    }
}