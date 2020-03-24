import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class GenericClass<T extends Comparable> {

    public List<T> list;


    public GenericClass() {
        list = new ArrayList<T>();
    }

    public boolean add(T t) {

        return list.add(t);

    }

    public boolean remove(T t) {

        return this.list.remove(t);

    }

    public boolean exist(T t) {

        return this.list.contains(t);

    }


    public T findMax() {
        if (this.list != null && !this.list.isEmpty()) {
            int i = 0;
            T var = list.get(i);
            while (i < list.size()) {

                if (1 == list.get(i).compareTo(var))
                    var = list.get(i);

                i++;
            }
            return var;
        } else
            return null;

    }

    public T findMin() {

        if (this.list != null && !this.list.isEmpty()) {
            int i = 0;
            T var = list.get(i);
            while (i < list.size()) {

                if (-1 == list.get(i).compareTo(var))
                    var = list.get(i);

                i++;
            }
            return var;
        } else
            return null;

    }

    public String toString() {
        if (this.list != null && !this.list.isEmpty()) {

            String retorno = " ";

            for (T e : this.list) {
                retorno += e.toString() + "\n";
            }
            return retorno;

        } else return " ";
    }

    public T deleteAndReturnLast() {

        if (this.list != null && !this.list.isEmpty()) {
            int i = this.list.size() - 1;
            T var = this.list.get(i);
            this.list.remove(i);
            return var;
        } else
            return null;
    }
}
