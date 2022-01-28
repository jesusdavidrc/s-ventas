package com.sventas;

public class Producto {
    private final int idProduct;
    private String name;
    private double price;
    private static int contadorProducts;


    private Producto() {
        this.idProduct = ++Producto.contadorProducts;
    }

    public Producto(String name, double price) {
        this();
        this.name = name;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecio() {
        return price;
    }

    public void setPrecio(double precio) {
        this.price = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProduct=" + idProduct +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
