package ni.edu.uam.desarrolloapi.repository;

import ni.edu.uam.desarrolloapi.modelos.Autor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepo extends JpaRepository<Autor,Long> {
    Pageable id(Long id);
}
