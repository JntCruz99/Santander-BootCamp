package br.com.jntcruz.SantanderBootCamp.service.impl;

import br.com.jntcruz.SantanderBootCamp.domain.model.User;
import br.com.jntcruz.SantanderBootCamp.domain.repository.UserRepository;
import br.com.jntcruz.SantanderBootCamp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) throws NoSuchFieldException {
        return userRepository.findById(id).orElseThrow(NoSuchFieldException::new);
    }

    @Override
    public User create(User user) {
        if (userRepository.existsByAccountNumber(user.getAccount().getNumber())){
            throw new IllegalArgumentException("this user Id already exists");
        }
        return userRepository.save(user);
    }
}
