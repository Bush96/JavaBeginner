package Lesson41AbstractClasses;

public abstract class Animal {                //abstract - означает класс который не является обьектов, а лишь чем то абстрактным как в данном примере
                                              // собака обьет, животное нет, в этом нужно указывать что обьект должен и может делать, далее кобязательно
                                              // наследовать от этого класса другой класс конкретного обьекта и в нем расписывать функциии абстрактного лкасса
    public void eat(){
        System.out.println("I am eating");
    }
    public abstract void makeSound();

}
