package com.portafolio.RestService.Repository;

import com.portafolio.RestService.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.transaction.Transactional;

@Repository
@Transactional
@EnableTransactionManagement
public interface UsuarioRepository extends JpaRepository<Usuario,String> {

}
