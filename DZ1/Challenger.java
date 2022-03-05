package DZ1;

public class Challenger {


    String name;
    int high;   // ability to jump crossbar
    boolean finish = true;  //  set false if any obstacle failed

    public Challenger (String name,  int high) {
        this.name = name;
        this.high = high;
    }

    public String getName() {
        return name;
    }

    public int getHigh() {
        return high;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
