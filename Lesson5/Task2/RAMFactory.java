package Lesson5.Task2;

public class RAMFactory {
    public Component createRAM(String ramType) {
        switch (ramType) {
            case "DesktopRAM":
                return new RAM(2400, 8, "DDR4", "Crucial");
            case "GamingRAM":
                return new RAM(3200, 16, "DDR4", "Corsair");
            case "ServerRAM":
                return new RAM(2400, 64, "DDR4", "Samsung");
            default:
                return null;
        }
    }
}