package ch.zmotions.repository;

import ch.zmotions.domain.UserEO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

public class UserRepositoryImpl {

    @Autowired
    UserRepository userRepository;

    public UserEO findUser(Long userId) throws NotFoundException {
        return userRepository.findByPk(userId).orElseThrow(NotFoundException::new);
    }
}
