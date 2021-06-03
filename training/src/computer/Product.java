package computer;

public class Product implements Comparable<Product>{
    private String naam;
    private int code;


    public Product(String naam) {
        this.naam = naam;
        this.code = hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (code != product.code) return false;
        return naam.equals(product.naam);
    }



    @Override
    public int hashCode() {
        int result = naam.hashCode();
        result = 31 * result + code;
        return result;
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }

    public String getNaam() {
        return naam;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "naam: " + naam +
                ", code: " + code;
    }
}
