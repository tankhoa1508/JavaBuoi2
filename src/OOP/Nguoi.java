package OOP;

import java.sql.SQLOutput;

public interface Nguoi {
    void noiNhieu();
    default void dungDienThoaiTrongLop(){
        System.out.println("mot vai ban lam dung viec dung dien thoai ....");
    }
}
