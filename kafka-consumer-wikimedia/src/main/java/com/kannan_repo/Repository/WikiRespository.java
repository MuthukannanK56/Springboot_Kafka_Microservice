package com.kannan_repo.Repository;

import com.kannan_repo.Entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WikiRespository extends JpaRepository<WikimediaData, Long> {

}
