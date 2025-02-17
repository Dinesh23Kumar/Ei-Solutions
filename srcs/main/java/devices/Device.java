package devices;

public abstract class Device {
    protected int id;
    protected String type;
    
    public Device(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract String getStatus();
}
