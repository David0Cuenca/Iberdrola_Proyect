package main.java.com.example.myapi.controller;

import com.example.myapi.model.Privada;
import com.example.myapi.repository.PrivadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/privadas")
public class PrivadaController {

    @Autowired
    private PrivadaRepository privadaRepository;

    @GetMapping
    public List<Privada> obtenerPrivadas() {
        return privadaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Privada obtenerPrivadaPorId(@PathVariable Long id) {
        return privadaRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Privada crearPrivada(@RequestBody Privada privada) {
        return privadaRepository.save(privada);
    }

    @PutMapping("/{id}")
    public Privada actualizarPrivada(@PathVariable Long id, @RequestBody Privada privadaActualizar) {
        Privada privadaExistente = privadaRepository.findById(id).orElse(null);

        if (privadaExistente != null) {
            privadaExistente.setTarifa(privadaActualizar.getTarifa());
            privadaExistente.setPrecio(privadaActualizar.getPrecio());

            // Actualiza otras propiedades según sea necesario

            return privadaRepository.save(privadaExistente);
        } else {
            return null; // Manejo de error si la privada no existe
        }
    }

    @DeleteMapping("/{id}")
    public void eliminarPrivada(@PathVariable Long id) {
        privadaRepository.deleteById(id);
    }
}
