package com.example.CrudDemo.service;

import com.example.CrudDemo.model.User;
import org.springframework.stereotype.Service;

import javax.naming.ldap.PagedResultsControl;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class Userservice {
    static List<User> list = new ArrayList<>();

    public User findbyid(int userid) {
        Predicate<? super User> predicate = user -> user.getUserId()==userid;
        User ans = list.stream().filter(predicate).findFirst().get();
        return ans;
    }

    public void add(User user) {
        list.add(user);
    }

    public List<User> findAll() {
        return list;
    }

    public void updateuser(int id, User newuser) {
        User olduser = findbyid(id);
        olduser.setUserId(newuser.getUserId());
        olduser.setName(newuser.getName());
        olduser.setAdderss(newuser.getAdderss());
        olduser.setPhoneNum(newuser.getPhoneNum());
        olduser.setUserName(newuser.getUserName());
    }

    public void delete(int id) {
        Predicate<? super User> predicate = user -> user.getUserId()==id;
        list.removeIf(predicate);
    }
}
