package gestorturnos.turnos.rest;

import gestorturnos.turnos.model.Botones;
import gestorturnos.turnos.service.BotonesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/boton/")
public class BotonesRest {
    @Autowired
    private BotonesService botonesService;

    @GetMapping
    private ResponseEntity<List<Botones>> obtenerBotones() {
        return ResponseEntity.ok(botonesService.findAll());

    }
    @PostMapping
    private ResponseEntity<Botones> saveBoton(@RequestBody Botones botones) {
        try {
            Botones botonGuardada = botonesService.save(botones);
            return ResponseEntity.created(new URI("/boton/" + botonGuardada.getNombre())).body(botonGuardada);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oh No "+e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

        }
    }
}
