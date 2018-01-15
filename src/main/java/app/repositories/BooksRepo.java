package app.repositories;

import app.entities.BooksEntity;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepo extends CrudRepository<BooksEntity, Integer>{
}
