package Lesson5.Task2;

public class Graphics {
    private String memory;
    private String memoryType;
    private String manufacturer;
    private String coolingType;

    public void graphicsInfo(String memory, String memoryType, String manufacturer, String coolingType) {
        this.memory = memory;
        this.memoryType = memoryType;
        this.manufacturer = manufacturer;
        this.coolingType = coolingType;
        System.out.println("Graphics:\nmanufacturer\t" + manufacturer + "\nmemoryType\t\t" + memoryType + "\nmemory\t\t\t" + memory + "\ncoolingType\t\t" + coolingType);
        System.out.println();
    }
}
