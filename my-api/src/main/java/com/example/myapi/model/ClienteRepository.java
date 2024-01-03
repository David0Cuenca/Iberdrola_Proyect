import org.springframework.data.jpa.repository.JpaRepository;
import com.example.myapi.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
    
}
