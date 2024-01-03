import com.example.myapi.model.Cliente;
import com.example.myapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> obtenerClientes() {
        return clienteRepository.findAll();
    }

    @GetMapping("/{dni}")
    public Cliente obtenerClientePorDni(@PathVariable String dni) {
        return clienteRepository.findById(dni).orElse(null);
    }

    @PostMapping
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @PutMapping("/{dni}")
    public Cliente actualizarCliente(@PathVariable String dni, @RequestBody Cliente clienteActualizar) {
        Cliente clienteExistente = clienteRepository.findById(dni).orElse(null);

        if (clienteExistente != null) {
            clienteExistente.setNombre(clienteActualizar.getNombre());
            clienteExistente.setNacimiento(clienteActualizar.getNacimiento());
            clienteExistente.setDomicilio(clienteActualizar.getDomicilio());

            // Actualiza otras propiedades según sea necesario

            return clienteRepository.save(clienteExistente);
        } else {
            return null; // Manejo de error si el cliente no existe
        }
    }

    @DeleteMapping("/{dni}")
    public void eliminarCliente(@PathVariable String dni) {
        clienteRepository.deleteById(dni);
    }
}

