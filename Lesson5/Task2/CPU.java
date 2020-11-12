package Lesson5.Task2;

public class CPU implements Component {
    private int frequency;
    private int coreQTY;
    private int cache;
    private String model;
    private String manufacturer;

    public CPU(int frequency, int coreQTY, int cache, String model, String manufacturer) {
        this.frequency = frequency;
        this.coreQTY = coreQTY;
        this.cache = cache;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getCoreQTY() {
        return coreQTY;
    }

    public int getCache() {
        return cache;
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
        str += " К-во ядер: " + coreQTY + ",";
        str += " Память кэш (МБ): " + cache + ",";
        str += " Модель: " + model + ",";
        str += " Производитель: " + manufacturer;
        return str;
    }
}