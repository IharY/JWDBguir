package by.bsuir.yanushkevich.lab01.task09;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add(new Ball("Blue", 1));
        basket.add(new Ball("White", 2));
        basket.add(new Ball("Blue", 3));
        basket.add(new Ball("Green", 4));

        int totalblue =0;
        double totalWeight = 0;
        for (Ball ball : basket.getBalls()) {
            totalWeight += ball.getWeight();
            if(ball.getColor().equals("Blue")){
                totalblue++;
            }
        }

        System.out.println("Вес всех шариков: " + totalWeight);
        System.out.println("Количество синих шариков: " + totalblue);
    }
}
