package Lesson5.Task2;

public class DriveFactory {
    public Component createDrive(String driveType) {
        switch (driveType) {
            case "DesktopDrive":
                return new Drive(240, "SSD", "Western Digital", "2.5");
            case "GamingDrive":
                return new Drive(1024, "SSD", "Western Digital", "2.5");
            case "ServerDrive":
                return new Drive(4096, "HDD", "Western Digital", "2.5");
            default:
                return null;
        }
    }
}
