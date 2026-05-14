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
    public  Libro getLibroById(@RequestBody Long id) {
        return libroServicio.getLibroById(id);
    }

    @PostMapping("/{id}")
    public Libro saveLibro(@PathVariable Libro libro) {
        return libroServicio.saveLibro(libro);
    }

    @DeleteMapping("/{id}")
    public void deleteLibroById(@PathVariable Long id) {
        deleteLibroById(id);
    }
}
