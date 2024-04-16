package bank.t2108a;

import java.util.concurrent.locks.ReentrantLock;

public class IdGenerate {
    private static Long id = 0L;
    private static ReentrantLock lock= new ReentrantLock();

    public static Long getNewID(){
        Long result;
        lock.lock();//khoa bien id lai chi cho duy nhat mot thread duoc truy xuat cap
        // de tranh tinh trang Data Racing!
        try {
            result = ++id; //tang roi gan vao result
        }finally {
            lock.unlock();//tang roi thi mo lock cho thread khac cung truy cap
            //neu nhu minh dung xong nha vs thi di ra thoi
        }
        return result;
    }
    private IdGenerate(){}
}
