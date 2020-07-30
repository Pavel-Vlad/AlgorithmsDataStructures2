import java.util.*;

public class AlgorithmsDataStructures2 {
    public static int[] GenerateBBSTArray(int[] a) {
        int[] resAr = new int[a.length];

        Arrays.sort(a);
        recurs(a, resAr, 0);

        return resAr;
    }

    private static int[] recurs(int[] arr, int[] resArr, int indexToAdd) {
        if (arr.length == 1) {  // condition for end recursion
            resArr[indexToAdd] = arr[0];
            return resArr;
        }

        int length = arr.length;
        int indexCenter = length / 2;

        resArr[indexToAdd] = arr[indexCenter];
        int[] arrLeft = Arrays.copyOfRange(arr, 0, indexCenter);
        recurs(arrLeft, resArr, indexToAdd * 2 + 1);
        int[] arrRight = Arrays.copyOfRange(arr, indexCenter + 1, length);
        recurs(arrRight, resArr, indexToAdd * 2 + 2);

        return resArr;
    }
}
