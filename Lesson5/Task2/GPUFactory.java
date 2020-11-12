package Lesson5.Task2;

public class GPUFactory {
    public Component createGPU(String GPUType) {
        switch (GPUType) {
            case "DesktopGPU":
                return new GPU(4, "GDDR4", "NVIDIA", "passive");
            case "GamingGPU":
                return new GPU(8, "GDDR6", "NVIDIA", "active");
            case "ServerGPU":
                return new GPU(2, "GDDR4", "NVIDIA", "passive");
            default:
                return null;
        }
    }
}
