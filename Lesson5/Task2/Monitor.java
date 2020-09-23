package Lesson5.Task2;

public class Monitor {
    private int frequency;
    private int diagonal;
    private String model;
    private String manufacturer;

    public void monitorInfo(String manufacturer, String model, int frequency, int diagonal) {
        this.frequency = frequency;
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
        this.model = model;
        System.out.println("Monitor:\nmanufacturer\t" + manufacturer + "\nmodel\t\t\t" + model + "\ndiagonal\t\t" + diagonal + "\nfrequency\t\t" + frequency);
        System.out.println();
    }
}
