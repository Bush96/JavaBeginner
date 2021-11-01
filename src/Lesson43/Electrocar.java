package Lesson43;

public class Electrocar {
    private int id;

    //Вложенные классы нужно для упращения кода, для его структуризации, они бывают:

    //Вложенный нестатический класс:                  //его мы обычно создаем внутри класса подобьекта если он сложный для того чтобы его разделить, чтобы мы могли вызывать его методы внутри этого же класса
    private class Motor{                       //но например в другом класс мы не можем вызвать метод этого нестатического класса
        public void startMotor(){
            System.out.println("Motor " + id + " is starting...");
        }
    }

    //Статический вложенный класс:             //обычно они публичные, они не имеют доступа к полям основного класса,
    public static class Battery {              //они используются для группировки классов обычно, эти класссы еще свзывает логика, еще они обычно используются из вне, потому моификатор их паблик
        public void charge(){
            System.out.println("Batery is starting...");
        }
    }


    public Electrocar(int id) {          //просто присваиваем обьектам ид
        this.id = id;
    }
    public void start() {
        Motor motor = new Motor();       //создание и испольование подобьекта нестатически вложенного класса
        motor.startMotor();

        final int x = 1;
        //Встроенный класс #3
        class SomeClass {
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeClass someObject = new SomeClass();
        test(someObject);

        System.out.println("Electrocar " +id + " is starting...");
    }

    private void test (Object object){

    }
}
