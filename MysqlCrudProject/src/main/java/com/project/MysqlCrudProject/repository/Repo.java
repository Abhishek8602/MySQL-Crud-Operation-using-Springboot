package com.project.MysqlCrudProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.MysqlCrudProject.domain.Student;

public interface Repo extends JpaRepository<Student, Long>{

}
