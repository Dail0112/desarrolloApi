package ni.edu.uam.desarrolloapi.controladores;

import ni.edu.uam.desarrolloapi.modelos.Autor;
import ni.edu.uam.desarrolloapi.servicios.AutorServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/api/autor")

public class AutorController {
    private final AutorServicio autorServicio;

    public AutorController(AutorServicio autorServicio) {
        this.autorServicio = autorServicio;
    }

    @GetMapping
    public List<Autor> obtenerAutores() {
        return autorServicio.getAllAutores();
    }

    @GetMapping("/{id}")
    public Autor getAutorById(@PathVariable Long id) {
        return autorServicio.getAutorById(id);
    }

    @PostMapping
    public Autor saveAutor(@RequestBody Autor autor) {
        return autorServicio.saveAutor(autor);
    }

    @PutMapping("/{id}")
    public Autor updateAutor(@PathVariable Long id, @RequestBody Autor autor) {
        return autorServicio.saveAutor(autor);
    }

    @DeleteMapping("/{id}")
    public void deleteAutorById(@PathVariable Long id) {
        autorServicio.deleteAutorById(id);
    }


}
