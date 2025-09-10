package _19_Visitor_pattern;

//Step 1: Visitor interface
interface ShoppingCartVisitor {
 int visit(Book book);
 int visit(Fruit fruit);
}

//Step 2: Element interface
interface ItemElement {
 int accept(ShoppingCartVisitor visitor);
}

//Step 3: Concrete Elements
class Book implements ItemElement {
 private int price;
 private String isbn;

 public Book(int cost, String isbn) {
     this.price = cost;
     this.isbn = isbn;
 }

 public int getPrice() {
     return price;
 }

 public String getIsbn() {
     return isbn;
 }

 @Override
 public int accept(ShoppingCartVisitor visitor) {
     return visitor.visit(this);
 }
}

class Fruit implements ItemElement {
 private int pricePerKg;
 private int weight;
 private String name;

 public Fruit(int priceKg, int wt, String name) {
     this.pricePerKg = priceKg;
     this.weight = wt;
     this.name = name;
 }

 public int getPricePerKg() {
     return pricePerKg;
 }

 public int getWeight() {
     return weight;
 }

 public String getName() {
     return name;
 }

 @Override
 public int accept(ShoppingCartVisitor visitor) {
     return visitor.visit(this);
 }
}

//Step 4: Concrete Visitor
class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
 @Override
 public int visit(Book book) {
     int cost;
     if (book.getPrice() > 50) {
         cost = book.getPrice() - 5; // discount of 5
     } else {
         cost = book.getPrice();
     }
     System.out.println("Book ISBN::" + book.getIsbn() + " cost = " + cost);
     return cost;
 }

 @Override
 public int visit(Fruit fruit) {
     int cost = fruit.getPricePerKg() * fruit.getWeight();
     System.out.println(fruit.getName() + " cost = " + cost);
     return cost;
 }
}

//Step 5: Client
public class  Demo {
 public static void main(String[] args) {
     ItemElement[] items = new ItemElement[] {
         new Book(60, "1234"),
         new Book(40, "5678"),
         new Fruit(10, 2, "Banana"),
         new Fruit(5, 5, "Apple")
     };

     int total = calculatePrice(items);
     System.out.println("Total Cost = " + total);
 }

 private static int calculatePrice(ItemElement[] items) {
     ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
     int sum = 0;
     for (ItemElement item : items) {
         sum += item.accept(visitor);
     }
     return sum;
 }
}

