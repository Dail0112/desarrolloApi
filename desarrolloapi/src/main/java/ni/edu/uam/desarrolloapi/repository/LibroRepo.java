package ni.edu.uam.desarrolloapi.repository;

import ni.edu.uam.desarrolloapi.modelos.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepo extends JpaRepository<Libro,Long> {
    Long id(Long id);
}
