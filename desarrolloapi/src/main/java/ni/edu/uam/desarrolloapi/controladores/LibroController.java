package ni.edu.uam.desarrolloapi.controladores;


import ni.edu.uam.desarrolloapi.modelos.Libro;
import ni.edu.uam.desarrolloapi.servicios.LibroServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libro")
public class LibroController {
    private final LibroServicio libroServicio;
    public LibroController(LibroServicio libroServicio) {
        this.libroServicio = libroServicio;
    }
    @GetMapping
    public List<Libro> obtenerLibros() {
        return libroServicio.getAllLibros();
    }

    @GetMapping("/{id}")
    public Libro getLibroById(@PathVariable Long id) {
        return libroServicio.getLibroById(id);
    }

    @PostMapping
    public Libro saveLibro(@RequestBody Libro libro) {
        return libroServicio.saveLibro(libro);
    }

    @PutMapping("/{id}")
    public Libro updateLibro(Libro libro) {
        return libroServicio.updateLibro(libro);
    }

    @DeleteMapping("/{id}")
    public void deleteLibroById(@PathVariable Long id) {
    libroServicio.deleteLibro(id);}
}
