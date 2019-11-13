package upgrad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan

public class BlogWebsite {

    public static void main(String[] args){
    SpringApplication.run(BlogWebsite.class);
    System.out.println(" Application Started");
    }
}
