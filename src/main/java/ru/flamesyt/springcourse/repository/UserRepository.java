package ru.flamesyt.springcourse.repository;

import org.springframework.data.repository.CrudRepository;
import ru.flamesyt.springcourse.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
