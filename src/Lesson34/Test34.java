package Lesson34;

import java.util.ArrayList;
import java.util.List;

public class Test34 {
    public static void main(String[] args) {
        List<Animal34> listOfAnimal = new ArrayList<>();   //создаем лист и пихаем в него обьекты со значениями
        listOfAnimal.add(new Animal34(1));
        listOfAnimal.add(new Animal34(2));

        List<Dog34> listOfDogs = new ArrayList<>();
        listOfAnimal.add(new Dog34());
        listOfAnimal.add(new Dog34());


        test(listOfAnimal);
    }
    /*
    иерархия наследования:
    Object
    Animal
    Dog
     */

    private static void test(List<? extends Animal34> list){      // <? extends Animal34> - вещб обьединяющая функции не только вызываемого класса но и наследователей
        for (Animal34 animal34 : list){
            System.out.println(animal34);
        }
    }
}
