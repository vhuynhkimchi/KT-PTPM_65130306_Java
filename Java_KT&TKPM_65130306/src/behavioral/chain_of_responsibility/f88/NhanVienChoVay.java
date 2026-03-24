package behavioral.chain_of_responsibility.f88;

public class NhanVienChoVay extends NhanVienF88{
    NhanVienF88 capTren;
    public NhanVienChoVay(String ten, String chucVu, int hanMucDuyetVay) {
        super(ten, chucVu, hanMucDuyetVay);
    }

    @Override
    public void duyetVay(int khoanVay) {
        if (khoanVay <= this.hanMucDuyetVay)
            System.out.println(this.chucVu + " " + this.ten + " duyet khoan vay: " + khoanVay);
        else
            this.capTren.duyetVay(khoanVay);
    }

    @Override
    public NhanVienF88 capTren(NhanVienF88 capTren) {
        this.capTren = capTren;
        return this.capTren;
    }
}
