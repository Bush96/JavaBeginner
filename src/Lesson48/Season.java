package Lesson48;

public enum Season {
    WINTER(-30), SUMMER(35), AUTUMN(20), SPRING(10);         // когда в enum мы просто чтото перечисляем, прога сразу создает из этого обьекты к которым
                                            // мы можем обращаться, иерархи у них таккая же как и у обычных классов
    private int temperature;
    Season(int temperature){
        this.temperature = temperature;
    }
    public int getTemperature(){
        return temperature;
    }
}
