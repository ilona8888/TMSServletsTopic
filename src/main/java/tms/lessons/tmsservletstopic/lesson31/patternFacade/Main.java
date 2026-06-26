package tms.lessons.tmsservletstopic.lesson31.patternFacade;

public class Main {
    public static void main(String[] args) {

        Disk disk = new Disk();
        Computer computer = new Computer();
        computer.switchOnComputer();
        computer.saveDataFromDisk(disk);
    }
}
