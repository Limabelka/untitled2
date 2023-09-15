package Mnogopotochka;

public class MyThead extends Thread {
    private double value;

    public MyThead(double value) {
        this.value = value;
    }
    @Override
    public void run(){
        System.out.println("Я спал "+ value + " секунд");
    }

}
