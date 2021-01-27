package guru.springframework.jokes.chucknorrisjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-norris-config.xml")
public class ChuckNorrisJokesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChuckNorrisJokesApplication.class, args);
    }

}
