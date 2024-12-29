package com.mohsin.Todo.Todo.Repository;

import com.mohsin.Todo.Todo.Entity.StatusValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepo extends JpaRepository<StatusValue,Long> {

    }
