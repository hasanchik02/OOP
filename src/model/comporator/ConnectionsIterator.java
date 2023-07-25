package model.comporator;

import java.util.Iterator;
import java.util.List;

import model.Connections;

public class ConnectionsIterator<T extends Connections> implements Iterator<T> {
     private int index;
    private List<T> humans;

    public ConnectionsIterator(List<T> humans) {
        this.humans = humans;
    }

    @Override
    public boolean hasNext() {
        return humans.size() > index;
    }

    @Override
    public T next() {
        return humans.get(index++);
    }
}
