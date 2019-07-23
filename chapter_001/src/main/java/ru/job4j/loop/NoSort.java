package ru.job4j.loop;

public class NoSort {

    public int[] merge(int[] firstArr, int[] secondArr) {
        int[] arr = new int[firstArr.length + secondArr.length];
        int idx = 0;
        int idxFirstArr = 0;
        int idxSecondArr = 0;
        boolean firstDone = false, secondDone = false;
        while (idx < arr.length) {
            if (firstArr[idxFirstArr] < secondArr[idxSecondArr] && !firstDone || secondDone) {
                arr[idx] = firstArr[idxFirstArr];
                if (idxFirstArr >= firstArr.length - 1) {
                    firstDone = true;
                } else {
                    idxFirstArr++;
                }
            } else if (secondArr[idxSecondArr] < firstArr[idxFirstArr] && firstDone || !secondDone) {
                arr[idx] = secondArr[idxSecondArr];
                if (idxSecondArr >= secondArr.length - 1) {
                    secondDone = true;
                } else {
                    idxSecondArr++;
                }
            }
            idx++;
        }
        return arr;
    }
}
