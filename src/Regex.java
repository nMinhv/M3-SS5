import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        System.out.println(validateUserName("Dudng123"));
//        tạo lóp validation kiểm tra sự chính xác của các dữ liệu:
//        email: gmail.com;
//        sdt: vietnam;
//        pass: bao mật cao;
//        ngày tháng năm: dd/MM/yyyy;
//        validate chuỗi nhập vào có phải là số không;
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1: Email");
            System.out.println("2: Phone");
            System.out.println("3: Password");
            System.out.println("4: Date");
            System.out.println("5: Number");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Email");
                    String email = sc.nextLine();
                    boolean isEmail = validEmail(email);
                    System.out.println(isEmail);
                    if(isEmail) {
                        System.out.println("Your email is valid");
                        break;
                    }else {
                        System.out.println("Email invalid");
                    }
                case 2:
                    System.out.println("Phone");
                    String phone = sc.nextLine();
                    boolean isPhone = validPhone(phone);
                    if(isPhone) {
                        System.out.println("Your phone is valid");
                        break;
                    }else {
                        System.out.println("Phone invalid");
                    }
                case 3:
                    System.out.println("Password");
                    String pass = sc.nextLine();
                    boolean isPass = validPassword(pass);
                    if(isPass) {
                        System.out.println("Your password is very Strong");
                        break;
                    }else {
                        System.out.println("password is weak");
                    }

                case 4:
                    System.out.println("Date(dd//mm//yyyy)");
                    String date = sc.nextLine();
                    boolean isDate = validDate(date);
                    if (isDate){
                        System.out.println("is Date");
                        break;
                    }else {
                        System.out.println("Not date");
                    }
//                case 5: System.out.println("Number");
//                    String num = sc.nextLine();
//                    boolean isNum = validNumber(num);
            }
        }
        while (choice != 6);


    }

    public static boolean validateUserName(String userName) {
//        8-12 char, none special, none space, start with Cap
//        String pattern = "^[A-Z]{1}[a-zA-Z0-9&&\\S]{7,11}$";
//        Pattern patt = Pattern.compile(pattern);
//        Matcher match = patt.matcher(userName);
//        return match.matches();
//        return Pattern.matches("^[A-Z]{1}[a-zA-Z0-9&&\\S]{7,11}$",userName);
        return userName.matches("^[A-Z]{1}[a-zA-Z0-9&&\\S]{7,11}$");
    }

    public static boolean validEmail(String email) {

        String ep = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        Pattern p = Pattern.compile(ep);
        Matcher m = p.matcher(email);
        return m.matches();

    }

    public static boolean validPhone(String phone) {
        String pp = "^[+84|0]\\d{9,10}";
        Pattern p = Pattern.compile(pp);
        Matcher m = p.matcher(phone);
        return m.matches();
    }

    public static boolean validPassword(String pass) {
        String passp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&().–{}:;',?/*~$^+=<>]).{8,20}$";
        Pattern p = Pattern.compile(passp);
        Matcher m = p.matcher(pass);
        return m.matches();
    }

    public static boolean validDate(String date) {
//        String dp = "^(0?[0-9]|12[0-9]|3[0-1])/|-(0?[0-9]|1[0-2])/|-([0-9])$";
        String dp = "^(0?[0-9]|[12][0-9]|3[0-1])(/|-)$";
        Pattern p = Pattern.compile(dp);
        Matcher m = p.matcher(date);
        return m.matches();
    }

    public static boolean validNumber(String num) {
        return true;
    }
}
