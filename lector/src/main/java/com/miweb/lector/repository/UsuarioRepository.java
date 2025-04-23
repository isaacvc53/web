package com.miweb.lector.repository;

import com.miweb.lector.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Aquí puedes crear consultas personalizadas más adelante (por ejemplo, buscar por email)
}
