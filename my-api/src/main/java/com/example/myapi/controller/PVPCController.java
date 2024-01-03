import com.example.myapi.model.PVPC;
import com.example.myapi.repository.PVPCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pvpcs")
public class PVPCController {

    @Autowired
    private PVPCRepository pvpcRepository;

    @GetMapping
    public List<PVPC> obtenerPvpcs() {
        return pvpcRepository.findAll();
    }

    @GetMapping("/{id}")
    public PVPC obtenerPvpcPorId(@PathVariable Long id) {
        return pvpcRepository.findById(id).orElse(null);
    }

    @PostMapping
    public PVPC crearPvpc(@RequestBody PVPC pvpc) {
        return pvpcRepository.save(pvpc);
    }

    @PutMapping("/{id}")
    public PVPC actualizarPvpc(@PathVariable Long id, @RequestBody PVPC pvpcActualizar) {
        PVPC pvpcExistente = pvpcRepository.findById(id).orElse(null);

        if (pvpcExistente != null) {
            pvpcExistente.setTarifa(pvpcActualizar.getTarifa());
            pvpcExistente.setPrecios(pvpcActualizar.getPrecios());

            // Actualiza otras propiedades según sea necesario

            return pvpcRepository.save(pvpcExistente);
        } else {
            return null; // Manejo de error si el pvpc no existe
        }
    }

    @DeleteMapping("/{id}")
    public void eliminarPvpc(@PathVariable Long id) {
        pvpcRepository.deleteById(id);
    }
}
