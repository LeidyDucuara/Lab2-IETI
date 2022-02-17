package co.edu.escuelaing.arep.parte1.service;

import co.edu.escuelaing.arep.parte1.data.User;
import co.edu.escuelaing.arep.parte1.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final HashMap<String,User> hashMapUsers = new HashMap<>();

    @Override
    public User create(User user) {
        return hashMapUsers.put(user.getId(),user);
    }

    @Override
    public User findById(String id) {
        User user = hashMapUsers.get(id);
        return user;
    }

    @Override
    public List<User> getAll() {
        ArrayList<User> users = new ArrayList<User>(hashMapUsers.values());
        return  users;
    }

    @Override
    public void deleteById(String id) {
        hashMapUsers.remove(id);
    }

    @Override
    public User update(User userDto, String userId) {
        return hashMapUsers.put(userId,userDto);
    }
}
