package com.zpchcbd.pojo;

public class People {
    public People(String name, String age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String name;
    public String age;
    public int weight;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", weight=" + weight +
                '}';
    }
}
