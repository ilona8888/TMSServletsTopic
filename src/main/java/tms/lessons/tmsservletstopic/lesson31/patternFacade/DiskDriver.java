package tms.lessons.tmsservletstopic.lesson31.patternFacade;

import java.util.ArrayList;

public class DiskDriver {

    private ArrayList<Data> dataArrayList = new ArrayList<>();
    ArrayList<Data> read(Disk disk){
        disk.getData();
        return dataArrayList;
    }
}
