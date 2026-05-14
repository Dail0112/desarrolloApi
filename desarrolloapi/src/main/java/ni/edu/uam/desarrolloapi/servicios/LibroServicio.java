package ni.edu.uam.desarrolloapi.servicios;

import ni.edu.uam.desarrolloapi.modelos.Libro;
import ni.edu.uam.desarrolloapi.repository.LibroRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServicio {
    private final LibroRepo libroRepo;
    public LibroServicio(LibroRepo libroRepo) {
        this.libroRepo = libroRepo;
    }
    public List<Libro> getAllLibros() {
        return libroRepo.findAll();
    }

    public Libro getLibroById(Long id) {
        return libroRepo.findById(id).orElse(null);
    }

    public Libro saveLibro(Libro libro) {
        return libroRepo.save(libro);
    }
    public Libro updateLibro(Libro libro) {
        return libroRepo.save(libro);
    }

    public void deleteLibro(Long id) {
        libroRepo.deleteById(id);
    }
}
