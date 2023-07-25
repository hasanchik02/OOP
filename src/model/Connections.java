package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Connections implements Serializable {
    private String name;
    private String sex;
    private int age;
    private Connections mother;
    private Connections father;
    private List<Connections> children;

    public Connections(String name, String sex, int age, Connections mother, Connections father) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.mother = mother;
        this.father = father;
        children = new ArrayList<>();
    }

    public Connections(String name, String sex, int age) {
        this(name, sex, age, null, null);
    }

    public void addChild(Connections child) {
        if (!children.contains(child)) {
            this.children.add(child);
            if (this.sex == "муж.") {
                child.father = this;
            } else
                child.mother = this;
        }
    }

    public String printChildren() {
        String res = " Дети: ";
        if (!this.children.isEmpty()) {
            for (int i = 0; i < children.size(); i++) {
                res += children.get(i).name + ",";
            }
        } else
            res += " нет";
        return res;
    }

    @Override
    public String toString() {
        String res = "Имя: " + name + ",\t Пол: " + sex + ", Возраст: " + age;
        if (this.mother != null) {
            res += ", Мать: " + mother.name;
        } else
            res += ", Мать: неизвестна";

        if (this.father != null) {
            res += ", Отец: " + father.name + ",";
        } else
            res += ", Отец: неизвестен,";

        res += printChildren();

        return res;
    }

    public String getName() {
        return name;
    }

    public Connections getFather() {
        return father;
    }

    public Connections getMother() {
        return mother;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
