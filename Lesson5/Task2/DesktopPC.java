package Lesson5.Task2;

public class DesktopPC extends Computer {
    @Override
    public void buildPC() {
        CPUFactory cpuFactory = new CPUFactory();
        CPU cpu = cpuFactory.createCPU();
        cpu.cpuInfo(3200, 2, "4MB", "Athlon 200GE", "AMD");

        RAMFactory ramFactory = new RAMFactory();
        RAM ram = ramFactory.createRAM();
        ram.ramInfo(2400, "8GB", "DDR4", "Crucial");

        GraphicsFactory graphicsFactory = new GraphicsFactory();
        Graphics graphics = graphicsFactory.createGraphics();
        graphics.graphicsInfo("4GB", "GDDR4", "NVIDIA", "passive");

        DriveFactory driveFactory = new DriveFactory();
        Drive drive = driveFactory.createDrive();
        drive.driveInfo("240GB", "SSD", "Western Digital", "2.5");

        MonitorFactory monitorFactory = new MonitorFactory();
        Monitor monitor = monitorFactory.createMonitor();
        monitor.monitorInfo("ASUS", "MG279Q", 120, 27 );
    }
}