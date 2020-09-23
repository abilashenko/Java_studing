package Lesson5.Task2;

public class GamingPC extends Computer {
    @Override
    public void buildPC() {
        CPUFactory cpuFactory = new CPUFactory();
        CPU cpu = cpuFactory.createCPU();
        cpu.cpuInfo(3800, 6, "32MB", "Ryzen 5 3600X", "AMD");

        RAMFactory ramFactory = new RAMFactory();
        RAM ram = ramFactory.createRAM();
        ram.ramInfo(3200, "16GB", "DDR4", "Corsair");

        GraphicsFactory graphicsFactory = new GraphicsFactory();
        Graphics graphics = graphicsFactory.createGraphics();
        graphics.graphicsInfo("8GB", "GDDR6", "NVIDIA", "active");

        DriveFactory driveFactory = new DriveFactory();
        Drive drive = driveFactory.createDrive();
        drive.driveInfo("1TB", "SSD", "Western Digital", "2.5");

        MonitorFactory monitorFactory = new MonitorFactory();
        Monitor monitor = monitorFactory.createMonitor();
        monitor.monitorInfo("Alienware", "AW3420DW", 144, 34 );
    }
}