package com.example.user.repository;

import com.example.user.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
     Optional<UserEntity> findByuserName(String userName);
}
