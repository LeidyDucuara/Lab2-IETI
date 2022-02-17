package co.edu.escuelaing.ieti.usuario.service;

import co.edu.escuelaing.ieti.usuario.data.User;

import java.util.List;

public interface UserService {

    User create(User user );

    User findById( String id );

    List<User> getAll();

    boolean deleteById( String id );

    User update(User userDto, String userId );

}
