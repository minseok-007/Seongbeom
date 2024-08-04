package oop;

public class TV {


    // Attribute
    String color;
    boolean power;
    int channel;

    TV() {

    }

    public TV(String color, int channel) {
        this.color = color;
        this.channel = channel;
    }

    public TV(String color) {
        this.color = color;
        this.power = power;
        this.channel = channel;
    }

    // Method
    void power() {
        power = !power;
    }
    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    public static void main(String[] args) {
        TV seongbeomTV = new TV();
        seongbeomTV.channel = 1;
        seongbeomTV.color = "Red";
        seongbeomTV.power = false;
        System.out.println("성범이의 티비 색깔은 " + seongbeomTV.color);
        seongbeomTV.color = "Blue";
        System.out.println("성범이의 티비 색깔은 " + seongbeomTV.color);

        TV minseokTV = new TV();
        minseokTV.channel = 10;
        System.out.println(minseokTV.channel);

        TV tv = new TV("Red", 100);
        System.out.println(tv.channel);


    }
}
