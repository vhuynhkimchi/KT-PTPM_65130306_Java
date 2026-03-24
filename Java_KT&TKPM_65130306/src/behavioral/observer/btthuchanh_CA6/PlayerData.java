package behavioral.observer.btthuchanh_CA6;

public class PlayerData {
    PlayerDataListener listener;
    int thoiGian, countDown, grade;

    public void attach(PlayerDataListener listener){
        this.listener = listener;
    }
    public void setThoiGian(int thoiGian){
        this.thoiGian = thoiGian;
    }
    public void setCountDown(int countDown){
        this.countDown = countDown;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public void ThongBao(){
        if(listener != null){
            listener.listen(this);
        }
    }
}
