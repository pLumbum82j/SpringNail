package org.example.music;

public class JazzMusic implements Music{
    private JazzMusic() { //Если конструктор приватный то нельзя будет создать где-то данный класс через new
    }
    public static JazzMusic getJazzMusic(){ // фабричный метод обязательно будет STATIC
        return new JazzMusic(); // возвращаем объект класса в котором находимся
    }

    @Override
    public String getSong() {
        return "This is jazz";
    }
}
