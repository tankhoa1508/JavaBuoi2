package OOP;

public class SinhVienVN extends SinhVien {
    private float trietHoc;

    public SinhVienVN(){
        super();
    }

    public SinhVienVN(float trietHoc){
        super();
        this.trietHoc= trietHoc;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Triet hoc: "+ trietHoc);
    }
}


