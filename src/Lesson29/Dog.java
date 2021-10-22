package Lesson29;

public class Dog extends Animal {                    //extends - наследование другого класа
    @Override
    public void eat(){                                //этот же метод есть в классе отце но он берет главенство при вызове в мэйне, так как этот кла наследник
        System.out.println("Lesson29.Dog is eating...");
    }

    public void bark(){
        System.out.println("Lesson29.Dog is barking...");
    }
}
