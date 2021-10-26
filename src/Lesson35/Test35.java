package Lesson35;

interface AbleToEat {            //в интерфейсах мы указываем сигнатуру метода, гооврим что нужно сделать но не пишем как эо делать
    public void eat();
}

public class Test35 {
    public static void main(String[] args) {
        AbleToEat ableToEat =new AbleToEat() {                //теневой класс используется так для одноразовой работы с обьектов,
            @Override                                         //чтобы не писать много лишнего кода для перраспределения какойто задачи
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };                              // точка с запятой маст хэв
        ableToEat.eat();
}
}
