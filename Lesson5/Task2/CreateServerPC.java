package Lesson5.Task2;

public class CreateServerPC implements ComputerCreate {
    @Override
    public Computer create() {
        CPUFactory cpuFactory = new CPUFactory();
        Component cpu = cpuFactory.createCPU("DesktopCPU");
        cpu.getInfo();

        RAMFactory ramFactory = new RAMFactory();
        Component ram = ramFactory.createRAM("DesktopRAM");

        Component gpu = null;

        DriveFactory driveFactory = new DriveFactory();
        Component drive = driveFactory.createDrive("DesktopDrive");

        Component monitor = null;

        return new Computer(cpu, ram, drive, gpu, monitor);
    }
}