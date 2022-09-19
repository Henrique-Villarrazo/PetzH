package br.com.villa.petzh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.villa.petzh.modelo.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	User findByUsername(String usermane);
}
