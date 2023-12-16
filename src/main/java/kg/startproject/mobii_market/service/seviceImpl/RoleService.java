package kg.startproject.mobii_market.service.seviceImpl;

import kg.startproject.mobii_market.model.Role;
import kg.startproject.mobii_market.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;

    public Role getUserRole(){
        return roleRepository.findByName("ROLE_USER").get();
    }
}
