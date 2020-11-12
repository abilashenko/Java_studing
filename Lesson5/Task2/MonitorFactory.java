package Lesson5.Task2;

public class MonitorFactory {
    public Component createMonitor(String monitorType) {
        switch (monitorType) {
            case "DesktopMonitor":
                return new Monitor(120, 27, "MG279Q", "ASUS");
            case "GamingMonitor":
                return new Monitor(144, 34, "AW3420DW", "Alienware");
            case "ServerMonitor":
                return new Monitor(100, 23, "S24F354FHI", "Samsung");
            default:
                return null;
        }
    }
}
