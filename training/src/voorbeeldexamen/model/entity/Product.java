package voorbeeldexamen.model.entity;

public abstract class Product implements Comparable<Product> {

    private int id;
    private String naam;
    private float prijs;

    public Product(String naam, float prijs) {
        this.id = hashCode();
        this.naam = naam;
        this.prijs = prijs;
    }

    public Product(int id, String naam, float prijs) {
        this.id = id;
        this.naam = naam;
        this.prijs = prijs;
    }

    public String getNaam() {
        return naam;
    }

    public float getPrijs() {
        return prijs;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != product.id) return false;
        if (Float.compare(product.prijs, prijs) != 0) return false;
        return naam != null ? naam.equals(product.naam) : product.naam == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (naam != null ? naam.hashCode() : 0);
        result = 31 * result + (prijs != +0.0f ? Float.floatToIntBits(prijs) : 0);
        return result;
    }

    @Override
    public int compareTo(Product o) {
        return this.id - o.getId();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                ", prijs=" + prijs +
                '}';
    }
}
