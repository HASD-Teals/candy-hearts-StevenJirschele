public class Heart {
    // PROPERTIES
    private String color;
    //Add remaining heart properties here...
    private String sayings;
    private int size;
    private int calories;
    private int stock;
    private double costPerPound;
    private boolean available;

    // CONSTRUCTORS
    public Heart() {
    this.color = "";
    this.sayings = "";
    this.size = 0;
    this.calories = 0;
    this.stock = 0;
    this.costPerPound = 0;
    this.available = false;
    } 
    public Heart(String color, String sayings, int size, int calories, int stock, double costPerPound, boolean available) {
        // This is the default contructor
    //Add overloaded Constructor here...
    this.color = color;
    this.sayings = sayings;
    this.size = size;
    this.calories = calories;
    this.stock = stock;
    this.costPerPound = costPerPound;
    this.available = available;
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
    public int getStock() {
        return this.stock;
    }
    public double getCostPerPound() {
        return this.costPerPound;
    }
    public boolean getAvailable() {
        return this.available;
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
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void setCostPerPound(int costPerPound) {
        this.costPerPound = costPerPound;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // METHODS
    public String report() {
        return this.color + " " + this.size + " " + this.sayings + " " + this.costPerPound + " " + this.stock; // Add other properties here as you add them to the class
    }
    //Write other methods here (if needed)...
    public void adjPrice(double percentage) {
        this.costPerPound = this.costPerPound + (costPerPound * percentage / 100);
    }
    public boolean inStock(int numHearts) {
        if(numHearts > 0) {
            available = true;
        }
        else {
            available = false;
        }
        return available;
    }
    public void adjStock(int newStock) {
        this.stock = newStock;
        this.available = this.stock > 0;
    }
}
