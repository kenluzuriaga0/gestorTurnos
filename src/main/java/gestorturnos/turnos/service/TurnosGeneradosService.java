package gestorturnos.turnos.service;

import gestorturnos.turnos.model.TurnosGenerados;
import gestorturnos.turnos.repository.TurnosGeneradosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurnosGeneradosService {
    @Autowired
    TurnosGeneradosRepo turnosGeneradosRepo;
}
