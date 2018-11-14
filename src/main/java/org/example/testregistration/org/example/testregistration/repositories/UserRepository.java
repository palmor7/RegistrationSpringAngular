package org.example.testregistration.org.example.testregistration.repositories;

import org.example.testregistration.org.example.testregistration.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {




}
