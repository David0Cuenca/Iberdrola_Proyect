package main.java.com.example.myapi.controller;

import com.example.myapi.model.Tarifa;
import com.example.myapi.repository.TarifaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarifas")
public class TarifaController {

    @Autowired
    private TarifaRepository tarifaRepository;

    @GetMapping
    public List<Tarifa> obtenerTarifas() {
        return tarifaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Tarifa obtenerTarifaPorId(@PathVariable Long id) {
        return tarifaRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Tarifa crearTarifa(@RequestBody Tarifa tarifa) {
        return tarifaRepository.save(tarifa);
    }

    @PutMapping("/{id}")
    public Tarifa actualizarTarifa(@PathVariable Long id, @RequestBody Tarifa tarifaActualizar) {
        Tarifa tarifaExistente = tarifaRepository.findById(id).orElse(null);

        if (tarifaExistente != null) {
            // Puedes agregar lógica de actualización según sea necesario

            return tarifaRepository.save(tarifaExistente);
        } else {
            return null; // Manejo de error si la tarifa no existe
        }
    }

    @DeleteMapping("/{id}")
    public void eliminarTarifa(@PathVariable Long id) {
        tarifaRepository.deleteById(id);
    }
}
