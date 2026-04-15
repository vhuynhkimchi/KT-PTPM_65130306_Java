package behavioral.template_method;

public class SinhVienDB extends EntitylyDB<SinhVien>{
    @Override
    protected int getKey(SinhVien sinhVien) {
        return sinhVien.maSV;
    }
}
