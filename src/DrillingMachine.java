public class DrillingMachine {
    private int watt;
    private String name;
    private int age;
    private double price;
    private boolean broken;

    public DrillingMachine() {
        this.name = "Standard_DM-Object";
        this.watt = (int) (800 + Math.random()*1200);
        this.age = (int) Math.random()*10;
        this.price = 50 + Math.random()*500;
    }

    public void becomeBroken() {
        this.broken = false;
    }
}
