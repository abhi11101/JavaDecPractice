package org.com.abhi.JDBC.MongoDB;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Arrays;

public class Products {

    @BsonProperty("_id")
    private String productId;
    private String brand;
    private String category;
    private String description;
    private double discountPercentage;
//    @BsonProperty("id")
//    private double id;
    private String[] images;
    private double price;
    private double rating;
    private double stock;
    private String thumbnail;
    private String title;

    public Products() {
    }

    public Products(String brand, String category, String description, double discountPercentage, String[] images, double price, double rating, double stock, String thumbnail, String title) {
        this.brand = brand;
        this.category = category;
        this.description = description;
        this.discountPercentage = discountPercentage;
//        this.id = id;
        this.images = images;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
        this.thumbnail = thumbnail;
        this.title = title;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

//    public double getId() {
//        return id;
//    }
//
//    public void setId(double id) {
//        this.id = id;
//    }

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productId='" + productId + '\'' +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", discountPercentage=" + discountPercentage +
//                ", id=" + id +
                ", images=" + Arrays.toString(images) +
                ", price=" + price +
                ", rating=" + rating +
                ", stock=" + stock +
                ", thumbnail='" + thumbnail + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
