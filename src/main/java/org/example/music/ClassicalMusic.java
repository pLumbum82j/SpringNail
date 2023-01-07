package org.example.music;

public class ClassicalMusic implements Music{
    public void doMyInit(){ // название метода может быть любым
        System.out.println("initialization my bean");
        // тут может быть любая логика установки коннекта с БД и прочее
    }

    public void doMyDestroy(){ // название метода может быть любым
        System.out.println("destruction my bean");
        // тут может быть любая логика завершения коннекта с БД и прочее
    }
    @Override
    public String getSong() {
        return "This is Classic";
    }
}
