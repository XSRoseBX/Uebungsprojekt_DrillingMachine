public class DrillingMachine {
    // task 1a)
    private int watt;
    private String name;
    private int age;
    private double price;
    private boolean broken;

    public DrillingMachine() {
        this.name = "Standard_DM-Object";
        this.watt = (int) (800 + Math.random()*1201);
        this.age = (int) Math.random()*11;
        this.price = ((int)((50 + Math.random()*450)*100))/100d;
    }

    // all getters
    public int getWatt() { return watt; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isBroken() { return broken; }

    // all setters
    public void setWatt(int watt) { this.watt = watt; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setPrice(double price) { this.price = price; }

    // task 2a)
    public void becomeBroken() {
        this.broken = true;
    }
    // task 2b)
    public void repair() {
        if (this.broken == true) {
            this.broken = false;
            this.price = this.price / 2;
        }
    }
    // task 2c)
    public void aging() {
        this.age += 1;
        if (this.age >= 10) {
            this.broken = true;
        }
    }
    // task 2d)
    public void reactOnHighDemand() { this.price *= 1.25; }

    // task 3a)
    public void setBroken(boolean isBroken) { this.broken = isBroken; }
    // task 3b)
    public void increasePrice(double amount) { this.price += amount; }
    // task 3c)
    public void changePower(int watt) {
        if (watt > 0) {
            this.watt += watt;
            if (watt > 100) { this.price *= 1.05; }
        } else if (watt < 0) {
            this.watt += watt;
            this.price *= 0.9;
        }
    }

    // task 4a)
    public double getPrice() { return this.price; }
    // task 4b)
    public boolean isInexpensive() {
        return (this.watt > 500 && this.price < 80);
    }
    // task 4c)
    public double getPricePerWatt() { return price / watt; }

    // task 5a)
    public boolean increasePriceByPercentage (double percentage) {
        if (percentage > 0.0) {
            this.price *= percentage;
            if (this.price > 100) { return true; }
            return false;
        }
        return false;
    }
    // task 5b)
    public boolean repair2() {
        if (this.broken) {
            this.broken = false;
            return true;
        }
        return false;
    }
    // task 5c)
    public String getInfo() {
        return ("Name: " + this.name +
                " - Age: " + this.age +
                " - Watts: " + this.watt +
                " - Price: " + this.price);
    }
}
