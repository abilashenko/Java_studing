package Lesson5.Task2;

public class CPU {
    private int frequency;
    private int coreQTY;
    private String cache;
    private String model;
    private String manufacturer;

    public void cpuInfo(int frequency, int coreQTY, String cache, String model, String manufacturer) {
        this.frequency = frequency;
        this.coreQTY = coreQTY;
        this.cache = cache;
        this.model = model;
        this.manufacturer = manufacturer;
        System.out.println("Processor:\nmanufacturer\t" + manufacturer + "\nmodel\t\t\t" + model + "\nfrequency\t\t" + frequency + "\ncoreQTY\t\t\t" + coreQTY + "\ncache\t\t\t" + cache);
        System.out.println();
    }
}
