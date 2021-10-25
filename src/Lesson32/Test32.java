package Lesson32;

public class Test32 {
    public static void main(String[] args) {
        Dog32 dog32 = new Dog32();
        /// ниже идет действие Upcasting - воходящее преобразование (здесь обьект собаку мы преращаем в животное)
        Animal32 animal32 = dog32;
        /// и Downcasting - нисходжее преобразоване
        Dog32 dog2 =(Dog32) animal32;
        dog2.bark();
    }
}
