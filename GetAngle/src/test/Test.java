package test;

/**
 * @author Conway
 * @date 2021/7/7 20:55
 */
public class Test {
    public static void main(String[] args) {
        String s = "54719 30.693218 104.057376 1";
        String[] sp = s.split(" ");
        System.out.println(Integer.parseInt(sp[0].trim()));
    }
}
