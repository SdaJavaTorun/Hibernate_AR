package com.sdajava.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "books", schema = "ksiegarnia")
public class BooksEntity {
    private String title;
    private String author;
    private Date published;
    private String isbn;
    private String category;
    private Integer pageCount;
    private String publisher;
    private BigDecimal price;
    private Integer onStock;
    private int id;

    @Column(name = "title", nullable = true, length = 128)
    public String getTitle () { return this.title; }
    public void setTitle (String title) { this.title = title; }

    @Column(name = "author", nullable = true, length = 128)
    public String getAuthor() { return this.author; }
    public void setAuthor(String author){ this.author = author;}

    @Column(name = "published", nullable = true)
    public Date getPublished (){ return this.published;}
    public void setPublished (Date published) {this.published = published;}

    @Column(name = "isbn", nullable = true, length = 17)
    public String getIsbn(){ return this.isbn;}
    public void setIsbn(String isbn) {this.isbn = isbn;}

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {return this.id;}
    public void setId (int id) {this.id = id;}

    @Column(name = "page_count", nullable = true)
    public Integer getPageCount() {return this.pageCount;}
    public void setPageCount (Integer pageCount) {this.pageCount = pageCount;}

    @Column(name = "publisher", nullable = true, length = 128)
    public String getPublisher() {return this.publisher;}
    public void setPublisher(String publisher) {this.publisher = publisher;}

    @Column(name = "category", nullable = true, length = 128)
    public String getCategory() {return this.category;}
    public void setCategory(String category) {this.category = category;}

    @Column(name = "price", nullable = true, precision = 2)
    public BigDecimal getPrice() {return this.price;}
    public void setPrice(BigDecimal price) {this.price = price;}

    @Column(name = "on_stock", nullable = true)
    public Integer getOnStock() {return this.onStock;}
    public void setOnStock (Integer onStock) {this.onStock = onStock;}
}
