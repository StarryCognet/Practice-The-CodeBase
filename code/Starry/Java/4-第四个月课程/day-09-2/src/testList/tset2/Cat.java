package testList.tset2;

public class Cat {
    private int id;
    private String name;
    private double hea;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHea() {
        return hea;
    }

    public void setHea(double hea) {
        this.hea = hea;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat(int id, String name, double hea, int age) {
        this.id = id;
        this.name = name;
        this.hea = hea;
        this.age = age;
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hea=" + hea +
                ", age=" + age +
                '}';
    }
}
