package gestorturnos.turnos.service;

import gestorturnos.turnos.repository.TurnoLlamadaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurnoLlamadaService {

    @Autowired
    TurnoLlamadaRepo turnoLlamadaRepo;
}
