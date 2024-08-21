package baiTap_docGia;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class DanhSachDocGia {
    private List<DocGia> arr;

    public DanhSachDocGia(){
        this.arr = new ArrayList<>();
    }

    public void nhap(){
        int flag=1;
        System.out.println("1: Nhập đọc giả trẻ em");
        System.out.println("2: Nhập đọc giả người lớn");
        System.out.println("3: Exit");
        System.out.println("###########################");

        while (true){
            System.out.println("Mời bạn nhập lựa chọn");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            flag=scanner.nextInt();
            DocGia a;
            if(flag==1){
                a=new DocGia_TreEm();

            }
            else if (flag==2){
                a=new DocGia_NguoiLon();
            }
            else {
                break;
            }
            a.nhap();
            arr.add(a);
        }
    }

    public void xuat(){
        for (DocGia d:this.arr){
            d.xuat();
        }
    }

    public long tongTien(){
        long tong=0;
        for (DocGia d:this.arr){
            tong+=d.tinhTien();
        }
        return tong;
    }
}
