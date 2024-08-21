package baiTap_docGia;

public class DocGia_TreEm extends DocGia {
    private String ten_NBH;

        public DocGia_TreEm(){
            this.setGia(5000);
        }

    public String getTen_NBH() {
        return ten_NBH;
    }

    public void setTen_NBH(String ten_NBH) {
        this.ten_NBH = ten_NBH;
    }

    @Override
        public void nhap(){
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.println("Nhap ten nguoi bao ho: ");
            this.ten_NBH = scanner.nextLine();
            super.nhap();
        }

        @Override
        public void xuat(){
            System.out.println("Ten nguoi bao ho: "+this.ten_NBH);
            super.xuat();
        }

        @Override
        public long tinhTien(){
            return getGia()*getSoThang();
        }
    }

