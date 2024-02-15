package com.exercise1.demo.repository;

import com.exercise1.demo.model.BlogModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<BlogModel,Long> {
}
