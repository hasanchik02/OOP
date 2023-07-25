package model.comporator;

import java.util.Comparator;

import model.Human;

public class HumanByName<E extends Human> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2){
        return o1.getName().compareTo(o2.getName());
    }
}
