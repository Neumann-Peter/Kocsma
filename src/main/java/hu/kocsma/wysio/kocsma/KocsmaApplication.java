package hu.kocsma.wysio.kocsma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class KocsmaApplication {
    public static void main(String[] args) {
        SpringApplication.run(KocsmaApplication.class, args);
    }

}
