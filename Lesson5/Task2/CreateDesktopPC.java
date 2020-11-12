package Lesson5.Task2;

public class CreateDesktopPC implements ComputerCreate {
    @Override
    public Computer create() {
        CPUFactory cpuFactory = new CPUFactory();
        Component cpu = cpuFactory.createCPU("DesktopCPU");

        RAMFactory ramFactory = new RAMFactory();
        Component ram = ramFactory.createRAM("DesktopRAM");

        Component gpu = null;

        DriveFactory driveFactory = new DriveFactory();
        Component drive = driveFactory.createDrive("DesktopDrive");

        MonitorFactory monitorFactory = new MonitorFactory();
        Component monitor = monitorFactory.createMonitor("DesktopMonitor");

        return new Computer(cpu, ram, drive, gpu, monitor);
    }
}