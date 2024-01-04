package main.java.com.example.myapi.controller;

import com.example.myapi.model.Contador;
import com.example.myapi.repository.ContadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contadores")
public class ContadorController {

    @Autowired
    private ContadorRepository contadorRepository;

    @GetMapping
    public List<Contador> obtenerContadores() {
        return contadorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Contador obtenerContadorPorId(@PathVariable Long id) {
        return contadorRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Contador crearContador(@RequestBody Contador contador) {
        return contadorRepository.save(contador);
    }

    @PutMapping("/{id}")
    public Contador actualizarContador(@PathVariable Long id, @RequestBody Contador contadorActualizar) {
        Contador contadorExistente = contadorRepository.findById(id).orElse(null);

        if (contadorExistente != null) {
            contadorExistente.setModelo(contadorActualizar.getModelo());
            contadorExistente.setActividad(contadorActualizar.getActividad());

            // Actualiza otras propiedades según sea necesario

            return contadorRepository.save(contadorExistente);
        } else {
            return null; // Manejo de error si el contador no existe
        }
    }

    @DeleteMapping("/{id}")
    public void eliminarContador(@PathVariable Long id) {
        contadorRepository.deleteById(id);
    }
}
