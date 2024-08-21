package baiTap_docGia;

public abstract class DocGia {
    private int soThang;
    private long gia;

    public DocGia(){

    }

    public int getSoThang(){
        return soThang;
    }

    public void setSoThang(int soThang){
        this.soThang = soThang;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public void nhap(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Nhap so thang: ");
        this.soThang = scanner.nextInt();
    }

    public void xuat(){
        System.out.println("So thang: "+this.soThang+"--- Gia: "+this.gia);
    }

    abstract long tinhTien();
}
