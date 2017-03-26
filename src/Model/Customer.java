package Model;

/** Klasse für ein Kunden-Objekt.
 * Created by Jean-Pierre on 26.03.2017.
 */
public class Customer{

    private String name;
    private int sales; //Umsatz

    /**
     * Ein Kunden-Objekt besteht aus einem Namen und einem getätigten Umsatz.
     * @param name
     */
    public Customer(String name){
        this.name = name;
        this.sales = 0;
    }

    public Customer(String name, int sales){
        this.name = name;
        this.sales = sales;
    }

    /**
     *
     * @return Name des Kunden-Objekts
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return Umsatz des Kunden-Objekts
     */
    public int getSales(){
        return sales;
    }

    /**
     *
     * @param newSales Neuer Umsatz
     */
    public void setSales(int newSales){
        this.sales = newSales;
    }

    //TODO 02: Überarbeite die Klasse so, dass sie in einem BinarySearchTree verwaltet werden kann. Kannst du auch ihre Darstellung im Baum effizient überarbeiten?
}
