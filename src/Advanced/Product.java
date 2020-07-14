package Advanced;

public class Product {

    String name;
    float price, taxPercentage;
    Type type;

    enum Type {
        COMMODITY,
        FOOD,
        DRINKS
    }

    public Product(String name, float price, Type type) {
        setName(name);
        setPrice(price);
        setType(type);
        setTaxPercentage(type);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(Type type) {
        this.price = price;
        switch (type) {
            case COMMODITY:
                this.taxPercentage = 0.2f;
                break;
            case FOOD:
                this.taxPercentage = 0.15f;
                break;
            case DRINKS:
                this.taxPercentage = 0.10f;
                break;
            default:
                this.taxPercentage = 100f;
                break;

        }
        this.taxPercentage = taxPercentage;
        this.type = type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}


