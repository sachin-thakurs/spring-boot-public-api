package spr.api.repositor;


import org.springframework.data.jpa.repository.JpaRepository;
import spr.api.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
