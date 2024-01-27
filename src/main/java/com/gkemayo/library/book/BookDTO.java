package com.gkemayo.library.book;

import java.time.LocalDate;

import com.gkemayo.library.category.CategoryDTO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Book Model")
public class BookDTO implements Comparable<BookDTO>{
	
	public String getIsbn() {
		return Isbn;
	}

	public void setIsbn(String isbn) {
		Isbn = isbn;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getOrdered() {
		return ordered;
	}

	public void setOrdered(Boolean ordered) {
		this.ordered = ordered;
	}

	@ApiModelProperty(value = "Book id")
	private Integer id;

	@ApiModelProperty(value = "Book title")
	private String title;
	
	
	@ApiModelProperty(value = "Book author")
	private String author;
	
    private Double price;
	
	private Boolean ordered;	
	
	private String Isbn;
	
	@ApiModelProperty(value = "Book category")
	private CategoryDTO category;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	

	

	

	

	

	

	

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public CategoryDTO getCategory() {
		return category;
	}

	public void setCategory(CategoryDTO category) {
		this.category = category;
	}

	@Override
	public int compareTo(BookDTO o) {
		return title.compareToIgnoreCase(o.getTitle());
	}
	
	
}
