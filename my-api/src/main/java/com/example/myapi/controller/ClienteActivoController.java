import com.example.myapi.model.ClienteActivo;
import com.example.myapi.repository.ClienteActivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes-activos")
public class ClienteActivoController {

    @Autowired
    private ClienteActivoRepository clienteActivoRepository;

    @GetMapping
    public List<ClienteActivo> obtenerClientesActivos() {
        return clienteActivoRepository.findAll();
    }

    @GetMapping("/{dni}")
    public ClienteActivo obtenerClienteActivoPorDni(@PathVariable String dni) {
        return clienteActivoRepository.findById(dni).orElse(null);
    }

    @PostMapping
    public ClienteActivo crearClienteActivo(@RequestBody ClienteActivo clienteActivo) {
        return clienteActivoRepository.save(clienteActivo);
    }

    @PutMapping("/{dni}")
    public ClienteActivo actualizarClienteActivo(@PathVariable String dni, @RequestBody ClienteActivo clienteActivoActualizar) {
        ClienteActivo clienteActivoExistente = clienteActivoRepository.findById(dni).orElse(null);

        if (clienteActivoExistente != null) {
            clienteActivoExistente.setFechaAlta(clienteActivoActualizar.getFechaAlta());
            clienteActivoExistente.setCliente(clienteActivoActualizar.getCliente());

            // Actualiza otras propiedades según sea necesario

            return clienteActivoRepository.save(clienteActivoExistente);
        } else {
            return null; // Manejo de error si el cliente activo no existe
        }
    }

    @DeleteMapping("/{dni}")
    public void eliminarClienteActivo(@PathVariable String dni) {
        clienteActivoRepository.deleteById(dni);
    }
}
