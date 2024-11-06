import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MultiSet<T> implements MultisetInterface<T>{
    List<T> elements;

    public MultiSet(){
        elements = new ArrayList<>();
    }
    public void add(T element){
        elements.add(element);
    }

    @Override
    public int mult(MultiSet<T> autre) {
        return 0;
    }

    @Override
    public boolean appartient(T element) {
        return false;
    }

    @Override
    public MultiSet<T> union(MultiSet<T> autre) {
        return null;
    }

    @Override
    public MultiSet<T> inter(MultiSet<T> autre) {
        return null;
    }

    @Override
    public int card() {
        return 0;
    }

    @Override
    public boolean inclus(MultiSet<T> autre) {
        return false;
    }

    @Override
    public boolean inclusEq(MultiSet<T> autre) {
        return false;
    }

    @Override
    public boolean notEmpty() {
        return false;
    }
}
