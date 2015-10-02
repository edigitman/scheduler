package ro.acme.schedule.repo;

import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;
import ro.acme.schedule.entity.User;

/**
 * Created by gitmaal on 02/10/2015.
 */
@Transactional
public interface UserRepo extends Repository<User, Long> {

    User findByName(String name);

}
