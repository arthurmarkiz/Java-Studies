package OOP.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price > 0 ? price : 0;
        this.quantity = quantity > 0 ? quantity : 0;
    }
    // Utiliazando do fator SOBRECARGA com mais de um Constructor:
    // O constructor que será utilizado, é definido na hora da
    // declaração das variáveis quando for instânciar a classe.
    public Product(String name, double price) {
        this.name = name;
        this.price = price > 0 ? price : 0;
    }
    public void displayProduct() {
        System.out.printf("Nome: %s%nPreço: R$%.2f%nEstoque: %d Unidades%n" +
                        "Valor total no estoque: R$%.2f%n",
                this.name, this.price, this.quantity, totalValueInStock());
    }
    public double totalValueInStock() {
        return this.price * this.quantity;
    }
    public void addProducts(int qty) {
        if (qty > 0) {
            this.quantity += qty;
        } else {
            System.out.println("Você não pode adicionar um número negativo ao estoque.");
        }
    }
    public void removeProducts(int qty) {
        if (qty > 0 && qty <= this.quantity) {
            this.quantity -= qty;
        } else {
            System.out.println("Você não pode remover mais do que a quantidade total do estoque.");
        }
    }
    public void setName(String newName) {
        if (newName != "") {
            this.name = newName;
        } else {
            System.out.println("O seu produto deve conter um nome.");
        }
    }
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Você não pode adicionar um valor negativo ao preço.");
        }
    }
}
