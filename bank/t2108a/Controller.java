package bank.t2108a;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private static long balanceNumber = 1000000;
    List<TransactionHistory> listHistory= new ArrayList<TransactionHistory>();

    public long getBalanceNumber(){
        return balanceNumber;
    }

    public static long transfer(long money){
        // kiem tra so tien nho hon 50.000 thi thong bao so tien chuyen toi thieu phai la 50.000
        // neu so tien chuyen lon hon so du thi thong bao tai khoan khong du
        // neu chuyen thanh cong thi thong bao chuyen khoan thanh cong in ra so du moi va themlich su giao dich moi
        return balanceNumber;
    }

    public void actionTransfer(){
        // thuc hien cac cong viec nhu nhap so tai khoan thu huong so tien mo ta tai day
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập số tài khoản thụ hưởng: ");
//        String account = scanner.nextLine();
//        System.out.print("Nhập số tiền muốn chuyển: ");
//        long amount = scanner.nextLong();
//        if (amount <= balanceNumber && amount > 0) {
//            balanceNumber -= amount;
//            System.out.println("Chuyển tiền thành công!");
//            System.out.println("Số dư hiện tại: " + Controller.formatMoney(balanceNumber));
//        } else {
//            System.out.println("Số dư không đủ hoặc số tiền không hợp lệ!");
//        }
//        scanner.nextLine(); // Clear buffer
//        scanner.close();
    }

    public void getHistory(){
        // in danh sanh lich su giao hang
        System.out.println("Chức năng xem lịch sử giao dịch chưa được cài đặt.");
    }

    //dinh dang so tien theo minh mong muon
    public static String formatMoney(long money){
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        //100000->100,000.00
        return formatter.format(money);
    }
}
