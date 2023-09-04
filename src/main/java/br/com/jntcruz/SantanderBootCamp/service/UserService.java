package br.com.jntcruz.SantanderBootCamp.service;

import br.com.jntcruz.SantanderBootCamp.domain.model.User;

public interface UserService {

    User findById(Long id) throws NoSuchFieldException;

    User create(User user);

}
