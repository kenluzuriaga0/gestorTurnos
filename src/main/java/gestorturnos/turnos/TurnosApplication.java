package gestorturnos.turnos;

import gestorturnos.turnos.model.Botones;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TurnosApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurnosApplication.class, args);
    }

}
