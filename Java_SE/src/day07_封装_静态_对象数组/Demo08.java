package day07_封装_静态_对象数组;

public class Demo08 {
    public static void main(String[] args) {
        String str = concat("&","KendrickLamar", "Drake","JayZ", "snoopDog");
        System.out.println("str = " + str);
    }
    public static String concat(String symbol, String...str){
        StringBuilder con = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            con.append(str[i]);
            if (i != str.length - 1) {
                con.append(symbol);
            }
        }
        return con.toString();
    }
}
