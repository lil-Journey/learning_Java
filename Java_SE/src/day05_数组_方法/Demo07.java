package day05_数组_方法;

public class Demo07 {
    public static void main(String[] args) {
        //动态初始化
        int[][] arr1 = new int[3][3];
        int arr2[][] = new int[3][3];
        int[] arr3[] = new int[3][3];

        //静态初始化
        String[][] arr4 = {{"白骨精", "蜘蛛精", "老鼠精"}, {"郭嘉", "大乔"}, {"宋江", "李逵", "卢俊义"}};
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.println(arr4[i][j]);
            }
        }
    }
}
