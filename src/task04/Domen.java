package task04;

import java.util.List;

public class Domen {
    private String name;
    private int frequency;

    public Domen(String name) {
        this.name = name;
        this.frequency = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
