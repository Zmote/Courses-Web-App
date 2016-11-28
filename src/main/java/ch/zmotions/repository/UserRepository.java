package ch.zmotions.repository;

import ch.zmotions.domain.UserEO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEO, Long> {

    /**
     * @param userId, id of user to find
     * @return UserEO, EO of found User
     * */
    Optional<UserEO> findByPk(Long userId);
}
