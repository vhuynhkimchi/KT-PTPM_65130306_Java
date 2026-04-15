package behavioral.template_method;

public class MonHocDB extends EntitylyDB<MonHoc>{
    @Override
    protected int getKey(MonHoc monHoc) {
        return monHoc.maMH;
    }
}
