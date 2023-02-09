// Generated with g9.

package sof3021.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;


import org.springframework.stereotype.Component;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "accounts")
public class Account implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(unique=true, nullable=false, precision=10)
	private Integer id;
//    @Column(unique=true, nullable=false, length=255)
	private String username;
//    @Column(nullable=false, length=255)
	private String password;
//    @Column(nullable=false, length=255)
	private String fullname;
//    @Column(unique=true, nullable=false, length=255)
	private String email;
//    @Column(length=255)
	private String photo;
//    @Column(nullable=false, precision=10)
	private int activated;
//    @Column(nullable=false, precision=10)
	private int admin;

}
