package api;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main 
{
	public static void main(String[] args) throws IOException 
    {
		
		new SpringApplication(Main.class).run(args);
		System.out.println();
		System.out.println("----------------Application is ready------------------");
		System.out.println();
    }
}
