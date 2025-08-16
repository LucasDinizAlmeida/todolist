package br.com.lucasdev.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name ="tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    
    private String name;
    private String username;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;
    


    // public void setName(String name) {
    //     this.name = name;
    // }
    // public String getName() {
    //     return name;
    // }

    // public void setUserName(String username) {
    //     this.username = username;
    // }
    // public String getUserName() {
    //     return username;
    // }

    // public void setPassword(String password) {
    //     this.password = password;
    // }
    // public String getPassword() {
    //     return password;
    // }
}
