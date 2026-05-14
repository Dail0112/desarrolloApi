package ni.edu.uam.desarrolloapi.servicios;

import ni.edu.uam.desarrolloapi.modelos.Autor;
import ni.edu.uam.desarrolloapi.repository.AutorRepo;
import ni.edu.uam.desarrolloapi.repository.LibroRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServicio {

    private final AutorRepo autorRepo;

    public AutorServicio(LibroRepo libroRepo, AutorRepo autorRepo) {
        this.autorRepo = autorRepo;
    }

    public List<Autor> getAllAutores() {
        return autorRepo.findAll();
    }

    public Autor getAutorById(Long id) {
        return autorRepo.findById(id).orElse(null);
    }

    public Autor saveAutor(Autor autor  ) {
        return autorRepo.save(autor);
    }
    public void deleteAutorById(Long id) {
        autorRepo.deleteById(id);
    }
}
