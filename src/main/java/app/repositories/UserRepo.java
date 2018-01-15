package app.repositories;

import app.entities.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<UserEntity, Integer>{

    @Query(value = "select * from user where account = ?1 ", nativeQuery = true)
    public UserEntity accoutValidate(String account);
}
