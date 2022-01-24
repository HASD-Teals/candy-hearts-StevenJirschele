public class Heart {
    // PROPERTIES
    private String color;
    //Add remaining heart properties here...
    private String sayings;
    private int size;
    private int calories;
    private int available;
    private double costPerPound;
    private boolean stock;

    // CONSTRUCTORS
    public Heart() {
    this.color = "";
    this.sayings = "";
    this.size = 0;
    this.calories = 0;
    this.available = 0;
    this.costPerPound = 0;
    this.stock = false;
    } 
    public Heart(String color, String sayings, int calories, int available, double costPerPound, boolean stock) {
        // This is the default contructor
    //Add overloaded Constructor here...
    this.color = color;
    this.sayings = sayings;
    this.calories = calories;
    this.available = available;
    this.costPerPound = costPerPound;
    this.stock = stock;
}
    // ACCESSORS
    public String getColor() {
        return this.color;
    }
    public String getSaying() {
        return this.sayings;
    }
    public int size() {
        return this.size;
    }
    public int getCalories() {
        return this.calories;
    }
    public int getAvailable() {
        return this.available;
    }
    public double getCostPerPound() {
        return this.costPerPound;
    }
    public boolean getStock() {
        return this.stock;
    }

    //Add remaining Accessor methods here...

    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }
    //Add remaining Mutator methods here...
    public void setSayings(String sayings) {
        this.sayings = sayings;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setGetCalories(int calories) {
        this.calories = calories;
    }
    public void setAvailable(int available) {
        this.available = available;
    }
    public void setCostPerPound(int costPerPound) {
        this.costPerPound = costPerPound;
    }
    public void setStock(boolean stock) {
        this.stock = stock;
    }

    // METHODS
    public String report() {
        return this.color + "\n" + this.available + "\n" + this.stock; // Add other properties here as you add them to the class
    }
    //Write other methods here (if needed)...
    public double adjPrice(double percentage) {
        return this.costPerPound = costPerPound * percentage;
    }
    public boolean inStock(int numHearts) {
        if(numHearts > 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
