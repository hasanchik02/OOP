package model.comporator;

import java.util.Comparator;

import model.Human;

public class HumanByAge<E extends Human> implements Comparator<E>{
    
    @Override
    public int compare(E o1, E o2){
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
