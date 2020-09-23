package Lesson5.Task2;

public class ServerPC extends Computer {
    @Override
    public void buildPC() {
        CPUFactory cpuFactory = new CPUFactory();
        CPU cpu = cpuFactory.createCPU();
        cpu.cpuInfo(2000, 6, "15MB", "Xeon E5-2620", "Intel");

        RAMFactory ramFactory = new RAMFactory();
        RAM ram = ramFactory.createRAM();
        ram.ramInfo(2400, "64GB", "DDR4", "Samsung");

        GraphicsFactory graphicsFactory = new GraphicsFactory();
        Graphics graphics = graphicsFactory.createGraphics();
        graphics.graphicsInfo("2GB", "GDDR4", "NVIDIA", "passive");

        DriveFactory driveFactory = new DriveFactory();
        Drive drive = driveFactory.createDrive();
        drive.driveInfo("4TB", "HDD", "Western Digital", "2.5");

        MonitorFactory monitorFactory = new MonitorFactory();
        Monitor monitor = monitorFactory.createMonitor();
        monitor.monitorInfo("Samsung", "S24F354FHI", 100, 23 );
    }
}
