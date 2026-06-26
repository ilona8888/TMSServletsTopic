package tms.lessons.tmsservletstopic.lesson31.patternFacade;

import java.util.ArrayList;

public class Computer {

    private Charger charger = new Charger();
    private Monitor monitor = new Monitor();
    private HDD hdd = new HDD();

    void switchOnComputer() {
        charger.charge();
        monitor.showScreen();
        hdd.load();
    }

    void saveDataFromDisk(Disk disk){
        DiskDriver diskDriver = new DiskDriver();
        ArrayList<Data> data = diskDriver.read(disk);
        monitor.updateScreen();
        hdd.saveOnComputer(data.get(0));
    }
}
