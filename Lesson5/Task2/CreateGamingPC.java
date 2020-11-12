package Lesson5.Task2;

public class CreateGamingPC implements ComputerCreate {
    @Override
    public Computer create() {
        CPUFactory cpuFactory = new CPUFactory();
        Component cpu = cpuFactory.createCPU("DesktopCPU");
        cpu.getInfo();

        RAMFactory ramFactory = new RAMFactory();
        Component ram = ramFactory.createRAM("DesktopRAM");

        GPUFactory gpuFactory = new GPUFactory();
        Component gpu = gpuFactory.createGPU("DesktopGPU");

        DriveFactory driveFactory = new DriveFactory();
        Component drive = driveFactory.createDrive("DesktopDrive");

        MonitorFactory monitorFactory = new MonitorFactory();
        Component monitor = monitorFactory.createMonitor("DesktopMonitor");

        return new Computer(cpu, ram, drive, gpu, monitor);
    }
}