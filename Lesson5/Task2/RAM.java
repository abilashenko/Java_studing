package Lesson5.Task2;

public class RAM {
    private int frequency;
    private String memory;
    private String memoryType;
    private String manufacturer;

    public void ramInfo (int frequency, String memory, String memoryType, String manufacturer) {
        this.frequency = frequency;
        this.memory = memory;
        this.memoryType = memoryType;
        this.manufacturer = manufacturer;
        System.out.println("RAM:\nmanufacturer\t" + manufacturer + "\nmemoryType\t\t" + memoryType + "\nmemory\t\t\t" + memory + "\nfrequency\t\t" + frequency);
        System.out.println();
    }
}
