package com.example.demo.moedl;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import javax.persistence.Column;

@Data
public class User {

	@Column(name = "account")
	@Schema(description = "編號")
	String account;

	@Column(name = "password")
	@Schema(description = "帳號")
	String password;

}
