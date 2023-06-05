package com.example.demo.moedl;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import javax.persistence.Column;

@Data
public class Users {

	@Column(name = "userId")
	@Schema(description = "使用者編號")
	String userId;

	@Column(name = "email")
	@Schema(description = "信箱")
	String email;

	@Column(name = "password")
	@Schema(description = "密碼")
	String password;

	@Column(name = "createdDate")
	@Schema(description = "建立時間")
	String createdDate;

	@Column(name = "lastModifiedDate")
	@Schema(description = "最後更新時間")
	String lastModifiedDate;

}
