package ro.acme.schedule.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import ro.acme.schedule.entity.User;
import ro.acme.schedule.repo.UserRepo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gitmaal on 02/10/2015.
 */
@Component("myUserService")
public class MyUserService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        User rentUser = userRepo.findByName(email);

        List<SimpleGrantedAuthority> auth = new ArrayList<SimpleGrantedAuthority>();
//        auth.add(new SimpleGrantedAuthority(rentUser.getRole()));

        return new org.springframework.security.core.userdetails.User(rentUser.getName(), "", auth);

//        return new User(rentUser.getName(), rentUser.getPass(),
//                StringUtils.isEmpty(rentUser.getToken()), true, true, true,
//                auth);
    }
}