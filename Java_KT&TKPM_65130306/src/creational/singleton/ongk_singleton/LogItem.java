package creational.singleton.ongk_singleton;

public class LogItem {
    private String thoiGian,noiDung, proId;

    public LogItem(String thoiGian, String noiDung, String proId) {
        this.thoiGian = thoiGian;
        this.noiDung = noiDung;
        this.proId = proId;
    }

    @Override
    public String toString() {
        return "LogItem{" +
                "thoiGian='" + thoiGian + '\'' +
                ", noiDung='" + noiDung + '\'' +
                ", proId='" + proId + '\'' +
                '}';
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }
}
