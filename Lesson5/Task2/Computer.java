package Lesson5.Task2;

public class Computer {
    private Component cpu;
    private Component ram;
    private Component drive;
    private Component gpu;
    private Component monitor;

    public Computer(Component cpu, Component ram, Component drive, Component gpu, Component monitor) {
        this.cpu = cpu;
        this.ram = ram;
        this.drive = drive;
        this.gpu = gpu;
        this.monitor = monitor;
    }

    public Component getCpu() {
        return cpu;
    }

    public Component getRam() {
        return ram;
    }

    public Component getDrive() {
        return drive;
    }

    public Component getGpu() {
        return gpu;
    }

    public Component getMonitor() {
        return monitor;
    }

    public String pcInfo() {
        String str = "";
        str += " Процессор: [" + cpu.getInfo() + "];\n";
        str += " ОЗУ: [" + ram.getInfo() + "];\n";
        str += " Жесткий диск: [" + drive.getInfo() + "];\n";

        if (gpu != null) {
            str += " Видеокарта: [" + gpu.getInfo() + "];\n";
        } else {
            str += " Видеокарта: [Интегрированная]\n";
        }

        if (monitor != null) {
            str += " Монитор: [" + monitor.getInfo() + "];\n";
        } else {
            str += " Монитор: [Отсутствует]\n";
        }

        return str;
    }
}