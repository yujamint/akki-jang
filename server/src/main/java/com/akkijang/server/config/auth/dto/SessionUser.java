package com.akkijang.server.config.auth.dto;

import com.akkijang.server.domain.user.User;
import java.io.Serializable;
import lombok.Getter;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String profileImage;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.profileImage = user.getProfileImage();
    }
}
