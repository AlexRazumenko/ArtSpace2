package org.alex.artspace.service.impl;

<<<<<<< HEAD
import org.alex.artspace.entity.Content;
=======
>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4
import org.alex.artspace.entity.User;
import org.alex.artspace.repository.UserRepository;
import org.alex.artspace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
<<<<<<< HEAD
=======
import java.util.Optional;
>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4

@Service
public class UserServiceImpl implements UserService {

<<<<<<< HEAD
    @Autowired
    private UserRepository userRepository;

//    @Autowired
=======
    private UserRepository userRepository;

    @Autowired
>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
userRepository.deleteById(id);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getOne(id);
    }

<<<<<<< HEAD
//    @Override
//    public Optional<User> findUserById(Long id) {
//        return userRepository.findById(id);
//    }
=======
    @Override
    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }
>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public User findUserByName(String name) {
        return userRepository.findUserByName(name);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
<<<<<<< HEAD

    @Override
    public List<Content> getContentByUser(Long id) {
        return null;
                //userRepository.f;
    }
=======
>>>>>>> a84aaf526732677e401adb2e6237c14f637126b4
}
