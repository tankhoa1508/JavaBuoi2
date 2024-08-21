import OOP.SinhVien;
import OOP.SinhVienNN;
import OOP.SinhVienVN;
import baiTap_docGia.DanhSachDocGia;
import baiTap_docGia.DocGia;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        SinhVien a = new SinhVien();
//        a.xuat();
//
//        SinhVien b = new SinhVien("Le Nai", 3,2);
//        b.xuat();
//
//        System.out.println("DTB:" +b.dtb());
//        System.out.println("DTB 2 sv:"+ b.dtb(a));
//        System.out.println("DTB 3 sv:"+ b.dtb(a,b));
//        SinhVienVN sv1 = new SinhVienVN();
//        sv1.xuat();

        DanhSachDocGia a=new DanhSachDocGia();
        a.nhap();
        a.xuat();
        System.out.println("Tổng tiền = "+a.tongTien());

    }
}