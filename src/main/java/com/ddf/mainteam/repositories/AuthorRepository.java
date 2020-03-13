package com.ddf.mainteam.repositories;

import com.ddf.mainteam.models.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by InnocentTIALO on 3/13/2020.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
