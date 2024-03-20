package com.example.todolist.Repository;

import com.example.todolist.Entity.ListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListRepository extends JpaRepository<ListEntity,Integer> {
    ListEntity findByStatus(String status);
}
