package com.srdevpereira.springbootmongodb.dto;

import com.srdevpereira.springbootmongodb.domain.User;

import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;

public class UserDTO implements Serializable {
    private String id;
    private String name;
    private String email;

    public UserDTO(){}
    public UserDTO (User obj){
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserDTO userDTO = (UserDTO) o;

        return Objects.equals(id, userDTO.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
