package Lesson46;

import java.io.Serial;
import java.io.Serializable;

public class Person46 implements Serializable {
    @Serial
    private static final long serialVersionUID = 291946952683198068L;            // эта строка предлагает автоматически сгенерироваться изза seerrialization чтоб файл ог рабоатть спустя изменения в структуре
    private  int id;                 // если после private напиать transient - в файл эта переменная не будет записываться, просто игнорироваться
    private String name;

    public Person46(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public String toString(){
        return id +" : " + name;
    }
}
