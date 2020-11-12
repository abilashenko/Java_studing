package Lesson5.Task2;

public class Monitor implements Component {
    private int frequency;
    private int diagonal;
    private String model;
    private String manufacturer;

    public Monitor(int frequency, int diagonal, String model, String manufacturer) {
        this.frequency = frequency;
        this.diagonal = diagonal;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String getInfo() {
        String str = "";
        str += "Частота (МГц): " + frequency + ",";
        str += " Диагональ (дюйм): " + diagonal + ",";
        str += " Производитель: " + manufacturer + ",";
        str += " Модель: " + model;
        return str;
    }
}