package jpa.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import jpa.example.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
