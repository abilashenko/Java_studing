package Lesson5.Task2;

public class Drive implements Component {
    private int memory;
    private String driveType;
    private String manufacturer;
    private String formFactor;

    public Drive(int memory, String driveType, String manufacturer, String formFactor) {
        this.memory = memory;
        this.driveType = driveType;
        this.manufacturer = manufacturer;
        this.formFactor = formFactor;
    }

    public int getMemory() {
        return memory;
    }

    public String getDriveType() {
        return driveType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getFormFactor() {
        return formFactor;
    }

    @Override
    public String getInfo() {
        String str = "";
        str += "Память (TB): " + memory + ",";
        str += " Тип диска: " + driveType + ",";
        str += " Производитель: " + manufacturer + ",";
        str += " Формфактор: " + formFactor;
        return str;
    }
}