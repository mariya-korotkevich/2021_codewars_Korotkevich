import java.util.Arrays;

public class ClosestWeight {

    public static int[][] closest(String strng) {

        int[][] result;

        String[] array = strng.split(" ");
        if (array.length > 2) {
            result = new int[2][3];
            int[] weights = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                int sum = 0;
                for (int j = 0; j < array[i].length(); j++) {
                    sum += Integer.parseInt(array[i].substring(j, j + 1));
                }
                weights[i] = sum;
            }

            int[] sortWeights = Arrays.copyOf(weights, weights.length);
            Arrays.sort(sortWeights);

            int weight1 = sortWeights[0], weight2 = sortWeights[1], diff = weight2 - weight1;

            for (int i = 1, j = 2; i < sortWeights.length - 2; i++, j++) {
                if ((sortWeights[j] - sortWeights[i]) < diff) {
                    diff = sortWeights[j] - sortWeights[i];
                    weight1 = sortWeights[i];
                    weight2 = sortWeights[j];
                }
            }

            int index1 = -1, index2 = -1;
            for (int i = 0; i < weights.length; i++) {
                if (index1 == -1 && weights[i] == weight1) {
                    index1 = i;
                } else if (index2 == -1 && weights[i] == weight2) {
                    index2 = i;
                }
            }
            result[0][0] = weights[index1];
            result[0][1] = index1;
            result[0][2] = Integer.parseInt(array[index1]);

            result[1][0] = weights[index2];
            result[1][1] = index2;
            result[1][2] = Integer.parseInt(array[index2]);
        }
        else{
            result = new int[0][0];
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(closest("456899 50 11992 176 272293 163 389128 96 290193 85 52"))); // "[[13, 9, 85], [14, 3, 176]]"
        System.out.println(Arrays.deepToString(closest("239382 162 254765 182 485944 134 468751 62 49780 108 54"))); // "[[8, 5, 134], [8, 7, 62]]";
        System.out.println(Arrays.deepToString(closest("241259 154 155206 194 180502 147 300751 200 406683 37 57"))); //"[[10, 1, 154], [10, 9, 37]]";
        System.out.println(Arrays.deepToString(closest("89998 187 126159 175 338292 89 39962 145 394230 167 1"))); //"[[13, 3, 175], [14, 9, 167]]";
        System.out.println(Arrays.deepToString(closest("462835 148 467467 128 183193 139 220167 116 263183 41 52"))); //"[[13, 1, 148], [13, 5, 139]]";
        System.out.println(Arrays.deepToString(closest("403749 18 278325 97 304194 119 58359 165 144403 128 38"))); //"[[11, 5, 119], [11, 9, 128]]";
        System.out.println(Arrays.deepToString(closest("28706 196 419018 130 49183 124 421208 174 404307 60 24"))); //"[[6, 9, 60], [6, 10, 24]]";
        System.out.println(Arrays.deepToString(closest("189437 110 263080 175 55764 13 257647 53 486111 27 66"))); //"[[8, 7, 53], [9, 9, 27]]";
        System.out.println(Arrays.deepToString(closest("79257 160 44641 146 386224 147 313622 117 259947 155 58"))); //"[[11, 3, 146], [11, 9, 155]]";
        System.out.println(Arrays.deepToString(closest("315411 165 53195 87 318638 107 416122 121 375312 193 59"))); //"[[15, 0, 315411], [15, 3, 87]]"
        System.out.println(Arrays.deepToString(closest("315411"))); //"[]"

    }
}
