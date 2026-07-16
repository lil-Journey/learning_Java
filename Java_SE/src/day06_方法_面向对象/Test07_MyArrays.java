package day06_方法_面向对象;

public class Test07_MyArrays {
    public void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public int indexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }

    public int[] copy(int[] arr, int len) {
        int[] newArr = new int[len];
        System.arraycopy(arr, 0, newArr, 0, len);
        return newArr;
    }
}
