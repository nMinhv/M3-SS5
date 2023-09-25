import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String
        String fullName = "Hung Ho";
        System.out.println(fullName);
        fullName = "Nam beo";
//        so sanh 2 chuỗi
        System.out.println(fullName.equalsIgnoreCase("Nam Beo"));
//        tìm kiêm chuỗi con trong chuỗi cha
        System.out.println(fullName.contains("am"));
//        chuỗi bắt đầu và kết thúc
        System.out.println(fullName.startsWith("Na"));
        System.out.println(fullName.startsWith("Nab"));
        System.out.println(fullName.endsWith("eo"));
        System.out.println(fullName.endsWith("aeo"));
//        kiểm tra 1 chuỗi rỗng?
        String str = "";
        System.out.println(str.isEmpty());
        System.out.println(fullName.isEmpty());
//        lấy vị trí của ký tự đầu tiên tìm được
        System.out.println(fullName.indexOf("m "));
//        tìm kiếm và thay thế chuỗi
        String content = "Because those people had brains and it was still early on. They were still reeling from WWI, cripples abounded, they had not yet recovered economically and they were not excited about another meat grinder war. Most importantly, they did not have the benefit of hindsight (like we do) to know how far Hitler was going to push his bullshit. It’s disingenuous to feel superior and act as though people back then should have predicted the future to know what we know after 70+ years of historical study and dissemination.";
       content = content.replace("still","");
        System.out.println(content);
//        nối chuỗi
        String newName = fullName.concat("Xuan");
        System.out.println(newName);
//        chuyển 1 chuỗi thành 1 mảng
        String nmbers = "1,2,3,4,5,6,7,8,9";
        String[] arr = nmbers.split(",");
        System.out.println(Arrays.toString(arr));
//        in hoa in thường , xóa khoảng trắng hai đầu
        String demo = "      hell   o      ";
        System.out.println(demo.trim());
//        duyệt chuỗi
        for (int i = 0; i <demo.length() ; i++) {
            System.out.println(demo.charAt(i));
        }
//         căt chuỗi
        System.out.println(content.substring(10,30));
//        ----------------------End----------------------

    }

}