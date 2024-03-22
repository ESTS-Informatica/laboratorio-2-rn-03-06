

/**
 * A property to sell.
 *
 * @author POO
 * @version 03/2024
 */
public class Property {

    private static int numberOfProperties = 0;
    private final int id;
    private String description;
    private double price;

    /**
     * Constructor of class Property
     *
     * @param description The property description.
     * @param price The property price.
     */
    public Property(String description, double price) {
        this.id = this.numberOfProperties;
        this.numberOfProperties++;
        
        this.description = description;
        this.price = price;
    }

    /**
     * Id selector.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Description selector.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Description modifier.
     * 
     * @param description The new description. Must not be null.
     */
    public void setDescription(String description) {
        return;
    }

    /**
     * Price selector.
     */
    public double getPrice() {
        return this.price;
    }
    
    /**
     * Price modifier.
     * 
     * @param price The new price. Must not be negative.
     */
    public void setPrice(double price) {
        return;
    }

    @Override
    public String toString() {
        
        String ouptut= String.format("Descricao : %s\n", this.description);
        ouptut += String.format("Preco : %s Euros", this.price);
        return ouptut;
        
    }
}
