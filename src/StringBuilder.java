import java.util.Scanner;

public class StringBuilder {
    public static void main(String[] args) {
        // khởi tạo đối tượng
        String fullName = "Hung hung";
        java.lang.StringBuilder string = new java.lang.StringBuilder(fullName);
        System.out.println(string);
//         các phương thức làm việc
        // append()
//       string.append(". Tuổi : 24");
//       string.append("1234567");
//        System.out.println(string);
        // insert vào vị trí xác định
        string.insert(4, " xuan");
        // delete subString
//        string.delete(2,5);
//        string.deleteCharAt(5);
        // reverse
//        string.reverse();
        // replace
//        string.replace(0,5,"da thay the");
        System.out.println(string);
        // ví dụ áp dụng
        Scanner sc = new Scanner(System.in);
        System.out.println("type something");
        java.lang.StringBuilder str2 = new java.lang.StringBuilder(sc.nextLine());
        String arr = "";
        for (int i = 0; i < str2.length(); i++) {
            java.lang.StringBuilder subStr = new java.lang.StringBuilder();
            subStr.append(str2.charAt(i));
            for (int j = i + 1; j < str2.length(); j++) {
                if (str2.charAt(j - 1) < str2.charAt(j)) {
                    subStr.append(str2.charAt(j));
                } else {
                    i = j;
                    break;
                }
            }
            if (arr.isEmpty()) {
                arr += subStr;
            } else {
                arr += "," + subStr;
            }
        }
        int maxl = 0;
        String[] array = arr.split(",");
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > array[maxl].length()) {
                maxl = i;
//                System.out.println(array[i]);
            }
        }
        System.out.println(array[maxl]);
    }
}
