package Lesson5.Task2;

public class CPUFactory {
    public Component createCPU(String cpuType) {
        switch (cpuType) {
            case "DesktopCPU":
                return new CPU(3200, 2, 4, "Athlon 200GE", "AMD");
            case "GamingCPU":
                return new CPU(3800, 6, 32, "Ryzen 5 3600X", "AMD");
            case "ServerCPU":
                return new CPU(2000, 6, 15, "Xeon E5-2620", "Intel");
            default:
                return null;
        }
    }
}