import java.util.Arrays;

public class UniqueNumber {
    private static double findUniq(double arr[]) {
        Arrays.sort(arr);

        double uniq = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == uniq){
                count++;
            }
            else if (count != 1){
                count = 1;
                uniq = arr[i];
            }
            else{
                break;
            }
        }

        return uniq;
    }

    public static void main(String[] args) {
        System.out.println(UniqueNumber.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 })); // => 2
        System.out.println(UniqueNumber.findUniq(new double[]{ 0, 0, 0.55, 0, 0 })); // => 0.55

        System.out.println(UniqueNumber.findUniq(new double[]{ 1, 1, 1, 1, 2 })); // => 2
        System.out.println(UniqueNumber.findUniq(new double[]{ 1, 2, 2, 2, 2 })); // => 1
        System.out.println(UniqueNumber.findUniq(new double[]{ 1, 1, 2, 3, 3 })); // => 2
    }
}
