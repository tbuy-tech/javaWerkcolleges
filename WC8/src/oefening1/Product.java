package oefening1;

import java.io.Serializable;

public class Product implements Comparable<Product>, Serializable {
    private String naam;
    private int nummer;

    public Product(String naam, int nummer) {
        this.naam = naam;
        this.nummer = nummer;
    }

    public String getNaam() {
        return naam;
    }

    public int getNummer() {
        return nummer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "naam='" + naam + '\'' +
                ", nummer=" + nummer +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (this.nummer > o.getNummer()) {
            return 1;
        } else if (this.nummer < o.getNummer()) {
            return -1;
        } else {
            return 0;
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (nummer != product.nummer) return false;
        return naam.equals(product.naam);
    }

    @Override
    public int hashCode() {
        int result = naam.hashCode();
        result = 31 * result + nummer;
        return result;
    }
}
