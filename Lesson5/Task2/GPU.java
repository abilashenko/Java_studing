package Lesson5.Task2;

public class GPU implements Component {
    private int memory;
    private String memoryType;
    private String manufacturer;
    private String coolingType;

    public GPU(int memory, String memoryType, String manufacturer, String coolingType) {
        this.memory = memory;
        this.memoryType = memoryType;
        this.manufacturer = manufacturer;
        this.coolingType = coolingType;
    }

    public int getMemory() {
        return memory;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCoolingType() {
        return coolingType;
    }

    @Override
    public String getInfo() {
        String str = "";
        str += "Память (GB): " + memory + ",";
        str += " Тип памяти: " + memoryType + ",";
        str += " Производитель: " + manufacturer + ",";
        str += " Тип охлаждения: " + coolingType;
        return str;
    }

}
