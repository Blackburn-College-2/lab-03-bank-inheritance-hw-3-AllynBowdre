package emptyjavaproject;

/**
 *
 * @author allyn
 */
public class Currency {

    private String name,sign;
 

    public Currency(String name, String sign) {
        this.name = name;
        this.sign = sign;
    }

    
    @Override
    public boolean equals(Object object) {
        return this.name.equals(object);
    }
}
