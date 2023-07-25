package model;

public class Human extends Connections {
    private static final long serialVersionUID = 1L;

    public Human(String name, String sex, int age) {
        super(name, sex, age);
    }

    public Human(String name, String sex, int age, Connections mather, Connections father) {
        super(name, sex, age, mather, father);
    }
}
