package gestorturnos.turnos.repository;

import gestorturnos.turnos.model.Botones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotonesRepo extends JpaRepository<Botones,Long> {



}
