public class HeartsClient {
    public static void main(String[] args) throws Exception {
      Heart Group1 = new Heart("red", "Hi", 1, 2, 3, 4.00, false);
      Heart Group2 = new Heart("Blue", "Hello", 5, 6, 7, 8.00, false);
      Heart Group3 = new Heart("Orange", "Hey", 9, 10, 11, 12.00, false);

      Heart[] store = {Group1, Group2, Group3};

      System.out.print("Group1: " + Group1.report() + "\n" + "Group2: " + Group2.report() + "\n" + "Group3: " + Group3.report());
      System.out.println("\n");
      System.out.print("Number of Hearts Available: " + buyOut(store));
      System.out.println("\n");
      System.out.print("Place Order Function for Group1: ");
      placeOrder(store, "red", 5);
      System.out.println("\n");
      System.out.print("AdjPrice Function for Group11: ");
      Group1.adjPrice(10.0);
      System.out.print(Group1.getCostPerPound());
      System.out.println("\n");
      System.out.print("AdjStock Function for Group1: ");
      Group1.adjStock(5);
      System.out.println("\n");
      System.out.println(Group1.getStock());
      System.out.print("InStock Function for Group1, with 0 Hearts: ");
      System.out.println(Group1.inStock(0));
      System.out.println("\n");
      System.out.print("InStock Function for Group1, with 8 Hearts: ");
      System.out.println(Group1.inStock(8));
    }
    
    public static int buyOut(Heart[] store) {
      int counter = 0;
      for(int i = 0; i < store.length; i++) {
        counter += store[i].getStock();
      }
      return counter;
    }
    
    public static void placeOrder(Heart[] store, String color, int num) {
      Heart temp = new Heart();
      for(int i = 0; i < store.length; i++) {
        if(store[i].getColor().toLowerCase().equals(color.toLowerCase())) {
          temp = store[i];
        }
      }
      System.out.print(temp.getCostPerPound() * num);
    } 
}
