package behavioral.chain_of_responsibility.f88;

public class ChuTich extends NhanVienF88{
    public ChuTich(String ten, String chucVu, int hanMucDuyetVay) {
        super(ten, chucVu, hanMucDuyetVay);
    }

    @Override
    public void duyetVay(int khoanVay) {
        if (khoanVay <= this.hanMucDuyetVay)
            System.out.println(this.chucVu + " " + this.ten + " duyet khoan vay: " + khoanVay);
        else
            System.out.println("Ra ngan hang vay.");
    }

    @Override
    public NhanVienF88 capTren(NhanVienF88 capTren) {
        return null;
    }
}
