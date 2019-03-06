package test_2_17_Multithreading;

public class MySumCount extends Thread {
    Integer startIndex;
    Integer stopIndex;

    public MySumCount(Integer startIndex) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }
}
