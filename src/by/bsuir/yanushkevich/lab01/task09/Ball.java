package by.bsuir.yanushkevich.lab01.task09;

//Задача 9. Решить задачу.
// Создать класс Мяч. Создать класс Корзина. Наполнить корзину мячиками. Определить вес
// мячиков в корзине и количество синих мячиков.

public class Ball {
    private int weight;
    private String color;
    public Ball(String color, int weight){
        this.weight = weight;
        this.color = color;
    }
    public int getWeight(){
        return  weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public String getColor(){
        return  color;
    }
    public void setColor(String color){
        this.color = color;
    }

}

