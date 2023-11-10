package com.example.customer.user;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name="user_tb")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    @Column(unique = true,length = 20,nullable = false)
    private  String username;
    @Column(length = 20,nullable = false)
    private  String password;
    @Column(length = 50,nullable = false)
    private  String email;
   @CreationTimestamp
    private Timestamp createAt;

    @Builder
    public User(Integer id, String username, String password, String email, Timestamp createAt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.createAt = createAt;
    }
}
