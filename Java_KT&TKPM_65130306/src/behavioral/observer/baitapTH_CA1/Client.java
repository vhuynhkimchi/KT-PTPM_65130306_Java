package behavioral.observer.baitapTH_CA1;

import java.util.List;

public class Client implements Listener<List<MonHoc>>{
    MyStream <List<MonHoc>> stream;

    public Client(MyStream<List<MonHoc>> stream) {
        this.stream = stream;
        this.stream.addListener(this);
    }

    @Override
    public void listen(List<MonHoc> monHocs) {
        for(var m : monHocs)
            System.out.println(m.toString());
    }
}
