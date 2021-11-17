package com.company;
import java.util.Objects;

public class galactic {
    public String name;
    public int count;

    public galactic(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "galactic{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
    void p_count(int count){
        System.out.println("In this galactic"+name+ " planet= "+count);
    }

    String star(String name){
        String a="";
        if(getName().equalsIgnoreCase(name))
            a="is star ="+getName();
        return a;
    }

    int countplanet(int n){
        return n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        galactic galactic = (galactic) o;
        return count == galactic.count && name.equals(galactic.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }
}
