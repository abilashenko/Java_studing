package Lesson5.Task2;

public class Drive {
    private String memory;
    private String driveType;
    private String manufacturer;
    private String formFactor;

    public void driveInfo(String memory, String driveType, String manufacturer, String formFactor) {
        this.memory = memory;
        this.driveType = driveType;
        this.manufacturer = manufacturer;
        this.formFactor = formFactor;
        System.out.println("Drive:\nmanufacturer\t" + manufacturer + "\ndriveType\t\t" + driveType + "\nmemory\t\t\t" + memory + "\nformFactor\t\t" + formFactor);
        System.out.println();
    }
}