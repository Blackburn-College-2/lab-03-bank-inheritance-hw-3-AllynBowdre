package emptyjavaproject;

/**
 *
 * @author allyn
 */
public class Currency {

    private final String name;
    private final String symbol;

    public Currency(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    
    @Override
    public boolean equals(Object object) {
        return this.name.equals(object);
    }
}
