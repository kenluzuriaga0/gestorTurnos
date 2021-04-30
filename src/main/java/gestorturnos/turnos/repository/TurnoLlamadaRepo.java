package gestorturnos.turnos.repository;

import gestorturnos.turnos.model.Botones;
import gestorturnos.turnos.model.TurnoLlamada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnoLlamadaRepo  extends JpaRepository<TurnoLlamada,Long> {
}
