package sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		log.info("************** Staring "+Application.class.getName()+" ...");
		SpringApplication.run(Application.class, args);
	}
	

    @GetMapping("/api")
    public String message()
    {
    	log.info("Called method message() ...");
        return "Hello World!";
    }

}