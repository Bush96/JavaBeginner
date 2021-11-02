package Lesson48;

public class Test48 {
    public static void main(String[] args) {
        Season season = Season.WINTER;         // таким образом мы обращаемся к обьектам класа enum

        System.out.println(season.getTemperature());
        }
        //так же мы в енуме можем просто перечислить пару обьектов без пояснения и здесь к ни обратиться, без появнения значит с конструктором по умолчанию,пример:
    /*
    switch (season){
    sout ("It is a warm outside");
    break;
     */
    }

