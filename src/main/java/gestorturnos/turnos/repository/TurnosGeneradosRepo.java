package gestorturnos.turnos.repository;

import gestorturnos.turnos.model.Botones;
import gestorturnos.turnos.model.TurnosGenerados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnosGeneradosRepo  extends JpaRepository<TurnosGenerados,Long> {
}
