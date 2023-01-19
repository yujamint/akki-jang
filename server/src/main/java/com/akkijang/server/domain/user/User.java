package com.akkijang.server.domain.user;

import com.akkijang.server.domain.BaseTimeEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false, unique = true)
    private String nickname;

    @Column
    private String interestedInstrument;

    @Column
    private String profileImage;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Builder
    public User(String nickname, String interestedInstrument, String profileImage, Role role) {
        this.nickname = nickname;
        this.interestedInstrument = interestedInstrument;
        this.profileImage = profileImage;
        this.role = role;
    }

    public String getRoleKey() {
        return this.role.getKey();
    }
}
