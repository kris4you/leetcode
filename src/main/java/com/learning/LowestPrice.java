package com.learning;

import java.util.*;

class Product {

    int startTime;
    int endTime;
    int price;

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public Product(int startTime, int endTime, int price) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "startTime=" + startTime + ", endTime=" + endTime + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Product))
            return false;
        Product product = (Product) o;
        return startTime == product.startTime && endTime == product.endTime && price == product.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, price);
    }
}

class LowestPriceTree {

    private Product root;
    private LowestPriceTree left;
    private LowestPriceTree right;

    LowestPriceTree(Product t) {
        this.root = t;
    }

    void insert(Product p) {

        if (p.startTime < root.startTime) {

            int endTime = Math.min(p.endTime, root.startTime);
            Product temp = new Product(p.startTime, endTime, p.price);
            if (this.left == null) {
                this.left = new LowestPriceTree(temp);
            } else {
                this.left.insert(temp);
            }
        }
        if (p.endTime > root.endTime) {

            int startTime = Math.max(p.startTime, root.endTime);
            Product temp = new Product(startTime, p.endTime, p.price);
            if (this.right == null) {
                this.right = new LowestPriceTree(temp);
            } else {
                this.right.insert(temp);
            }
        }
    }

    public void traverse(List<Product> inOrderList) {

        if (this.left != null) {
            this.left.traverse(inOrderList);
        }
        inOrderList.add(root);
        if (this.right != null) {
            this.right.traverse(inOrderList);
        }

    }

}

public class LowestPrice {

    static List<Product> getLowestPrices(List<Product> input) {

        input.sort(Comparator.comparing(Product::getPrice));
        LowestPriceTree tree = new LowestPriceTree(input.get(0));

        for (int i = 1; i < input.size(); i++) {
            tree.insert(input.get(i));
        }
        List<Product> resu = new ArrayList<>();
        tree.traverse(resu);
        return resu;
    }

    public static void main(String[] args) {
        System.out.println(getLowestPrices(Arrays.asList(new Product(1, 20, 13), new Product(7, 10, 8),
                new Product(3, 8, 15), new Product(1, 5, 20)

        )));
    }

}
