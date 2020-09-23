package Lesson5.Task2;

public class PCType {
   Computer computer;

    public void setComputer (Computer computer) {
        this.computer = computer;
    }

    public void configurePC() {
        if(computer != null)
        computer.buildPC();
    }
}
