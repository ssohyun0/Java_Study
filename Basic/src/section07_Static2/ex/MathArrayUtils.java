package section07_Static2.ex;

public class MathArrayUtils {
    private MathArrayUtils(){

    }

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values)/ values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if(minValue > value){
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if(maxValue < value){
                maxValue = value;
            }
        }
        return maxValue;
    }
}
