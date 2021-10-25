package Lesson34;


public class Animal34 {

    private int id;                 //просто присаиваем какоето значение классу

    public Animal34(){              //этот конструктор нужен здесь для того чтбы класс дог мог работать с List

    }
    public Animal34 (int id){
        this.id = id;

    }
    public void eat() {
        System.out.println("Aminal is eating...");
    }
    public String toString(){                      //???
        return String.valueOf(id);
    }
}
