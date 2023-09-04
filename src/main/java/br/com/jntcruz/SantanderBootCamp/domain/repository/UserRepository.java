package br.com.jntcruz.SantanderBootCamp.domain.repository;

import br.com.jntcruz.SantanderBootCamp.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumer);
}
