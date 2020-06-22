package com.example.Whathg_Database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Whathg_Database.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}