import com.example.myapi.model.Contrato;
import com.example.myapi.repository.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contratos")
public class ContratoController {

    @Autowired
    private ContratoRepository contratoRepository;

    @GetMapping
    public List<Contrato> obtenerContratos() {
        return contratoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Contrato obtenerContratoPorId(@PathVariable Long id) {
        return contratoRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Contrato crearContrato(@RequestBody Contrato contrato) {
        return contratoRepository.save(contrato);
    }

    @PutMapping("/{id}")
    public Contrato actualizarContrato(@PathVariable Long id, @RequestBody Contrato contratoActualizar) {
        Contrato contratoExistente = contratoRepository.findById(id).orElse(null);

        if (contratoExistente != null) {
            contratoExistente.setCliente(contratoActualizar.getCliente());
            contratoExistente.setTarifa(contratoActualizar.getTarifa());
            contratoExistente.setContador(contratoActualizar.getContador());

            // Actualiza otras propiedades según sea necesario

            return contratoRepository.save(contratoExistente);
        } else {
            return null; // Manejo de error si el contrato no existe
        }
    }

    @DeleteMapping("/{id}")
    public void eliminarContrato(@PathVariable Long id) {
        contratoRepository.deleteById(id);
    }
}
