package guru.springframework.springrest.service;

import guru.springframework.api.User;

import java.util.List;

public interface ApiService {
    List<User> getUser(Integer limit);
}
