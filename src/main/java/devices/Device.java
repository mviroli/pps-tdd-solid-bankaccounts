package devices;

public class Device {
    private boolean on = false;

    public boolean isOn() {
        return this.on;
    }

    public void switchOn() {
        if (this.on){
            throw new IllegalStateException();
        }
        this.on = true;
    }

    public void switchOff() {
        this.on = false;
    }
}
