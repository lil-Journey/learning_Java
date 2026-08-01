package day07_封装_静态_对象数组;

public class Demo13 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 12, 67, 89};
        int min = 0;
        int max = arr.length - 1;
        int result = method(12,arr,min,max);
        if (result != -1) {
            System.out.println("result = arr[" + result + "] value = " + arr[result]);
        }
    }
    public static int method(int n,int[] arr,int min,int max){
        if(min > max){
            System.out.println("error");
            return -1;
        }
        int mid = min + (max - min) / 2;
        if(n > arr[mid]){
            return method(n,arr,mid + 1,max);
        }
        else if(n < arr[mid]){
            return method(n,arr,min,mid - 1);
        }
        else {
            return mid;
        }
    }
}
