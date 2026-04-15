package behavioral.template_method;

import java.util.ArrayList;

public abstract class EntitylyDB<T> {
    private ArrayList<T> list =new ArrayList<>(

    );

    abstract protected int getKey(T t);


    public boolean add(T t){
        for(var item : list){
            if (getKey(item) == getKey(t))
                return false;
        }
        list.add(t);
        return true;
    }
    public int update(T t){
        T temp = findById(getKey(t));
        if(temp != null){
            int index = list.indexOf(temp);
            list.set(index, t);
            return 1;
        }
        return 0;
    }
    public int delete(T t){
        T temp = findById(getKey(t));
        if (temp == null)
            return 0;
        list.remove(temp);
        return 1;
    }
    public T findById(int id){
        for (var item : list){
            if (getKey(item) == id){
                return item;
            }
        }
        return null;
    }
    public int deleteByKey(int id){
        for (var item : list){
            if (getKey(item) == id){
                list.remove(item);
                return 1;
            }
        }
        return 0;
    }
}
