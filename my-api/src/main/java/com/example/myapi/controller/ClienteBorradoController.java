package main.java.com.example.myapi.controller;

import com.example.myapi.model.ClienteBorrado;
import com.example.myapi.repository.ClienteBorradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes-borrados")
public class ClienteBorradoController {

    @Autowired
    private ClienteBorradoRepository clienteBorradoRepository;

    @GetMapping
    public List<ClienteBorrado> obtenerClientesBorrados() {
        return clienteBorradoRepository.findAll();
    }

    @GetMapping("/{dni}")
    public ClienteBorrado obtenerClienteBorradoPorDni(@PathVariable String dni) {
        return clienteBorradoRepository.findById(dni).orElse(null);
    }

    @PostMapping
    public ClienteBorrado crearClienteBorrado(@RequestBody ClienteBorrado clienteBorrado) {
        return clienteBorradoRepository.save(clienteBorrado);
    }

    @PutMapping("/{dni}")
    public ClienteBorrado actualizarClienteBorrado(@PathVariable String dni, @RequestBody ClienteBorrado clienteBorradoActualizar) {
        ClienteBorrado clienteBorradoExistente = clienteBorradoRepository.findById(dni).orElse(null);

        if (clienteBorradoExistente != null) {
            clienteBorradoExistente.setFechaBaja(clienteBorradoActualizar.getFechaBaja());
            clienteBorradoExistente.setCliente(clienteBorradoActualizar.getCliente());

            // Actualiza otras propiedades según sea necesario

            return clienteBorradoRepository.save(clienteBorradoExistente);
        } else {
            return null; // Manejo de error si el cliente borrado no existe
        }
    }

    @DeleteMapping("/{dni}")
    public void eliminarClienteBorrado(@PathVariable String dni) {
        clienteBorradoRepository.deleteById(dni);
    }
}
