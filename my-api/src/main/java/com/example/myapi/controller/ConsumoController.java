package main.java.com.example.myapi.controller;

import com.example.myapi.model.Consumo;
import com.example.myapi.repository.ConsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consumos")
public class ConsumoController {

    @Autowired
    private ConsumoRepository consumoRepository;

    @GetMapping
    public List<Consumo> obtenerConsumos() {
        return consumoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Consumo obtenerConsumoPorId(@PathVariable Long id) {
        return consumoRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Consumo crearConsumo(@RequestBody Consumo consumo) {
        return consumoRepository.save(consumo);
    }

    @PutMapping("/{id}")
    public Consumo actualizarConsumo(@PathVariable Long id, @RequestBody Consumo consumoActualizar) {
        Consumo consumoExistente = consumoRepository.findById(id).orElse(null);

        if (consumoExistente != null) {
            consumoExistente.setContador(consumoActualizar.getContador());
            consumoExistente.setFecha(consumoActualizar.getFecha());
            consumoExistente.setkWh(consumoActualizar.getkWh());

            // Actualiza otras propiedades según sea necesario

            return consumoRepository.save(consumoExistente);
        } else {
            return null; // Manejo de error si el consumo no existe
        }
    }

    @DeleteMapping("/{id}")
    public void eliminarConsumo(@PathVariable Long id) {
        consumoRepository.deleteById(id);
    }
}
