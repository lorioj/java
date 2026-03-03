package main.generics.superextends;

import java.util.ArrayList;
import java.util.List;

public class SuperAndExtends {

    public static void main(String[] args) {

//        List<Animal> l = new ArrayList<>();
//        method(l);

//        List<Animal> cats = new ArrayList<>();
//        method(cats);

//        List<Animal> le = new ArrayList<>();
//        methodextend(le);


//        List<Dog> dogs = new ArrayList<>();
//        methodextend(dogs);

    }

    static void method(List<? super Animal> l){
        l.add(new Dog());
        l.add(new Cat());
        Object n = l.get(0);
        Animal a = (Animal) n;
        System.err.println(l.size() + " - " +  a.toString());
    }

    static void methodextend(List<? extends Animal> l){
        System.err.println(l.get(0));
    }


}
