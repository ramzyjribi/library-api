package com.gkemayo.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gkemayo.library.book.Book;
import com.gkemayo.library.book.IBookService;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class LibraryApplication implements CommandLineRunner {
	
	@Autowired
	private IBookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}
	
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.gkemayo.library"))              
          .paths(PathSelectors.any())                          
          .build()
          .apiInfo(apiInfo());                                           
    }
	
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Library Spring Boot REST API Documentation")
            .description("REST APIs For Managing Books loans in a Library")
            .contact(new Contact("Georges Kemayo", "https://gkemayo.developpez.com/", "noreply.library.test@gmail.com"))
            .version("1.0")
            .build();

    }

	@Override
	public void run(String... args) throws Exception {
			
				
		
	}

}
