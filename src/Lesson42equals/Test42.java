package Lesson42equals;

public class Test42 {
    public static void main(String[] args){
        /*
    int a =1;
    int b =1;
    System.out.println(a ==b);               // == значит знак сравнени чего либо.

         */
        Animal42 animal1 = new Animal42(1);
        Animal42 animal2 = new Animal42(1);

        System.out.println(animal1.equals(animal2));       //ссылочное равнение, не задевает структурное, примитивное короче
}
static class Animal42{
        private int id;

        public Animal42(int id){                // забыл нахуй это
            this.id = id;
        }


    public boolean equals(Object obj) {                 //equals - метод сравнивающий обьекты по их структуре,ссылочные, не для примитивов а посерьезнее
            Animal42 othersAnimal = (Animal42) obj;      //преобразование из пошлых уроков
        return this.id == othersAnimal.id;               //обязательное условие equals для структурного сравнивани


        /*
        строки сравниваются таким образом:

          String string1 = ("Hello");
          String string2 = ("Hello");
          Sout (string1.equels(string2));

          и все будет работать.
         */
    }
}
}
