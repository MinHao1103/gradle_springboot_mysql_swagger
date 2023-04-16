package com.example.demo.moedl;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import javax.persistence.Column;

@Data
public class User {

	@Column(name = "id")
	@Schema(description = "編號")
	Integer id;

	@Column(name = "count")
	@Schema(description = "帳號")
	String count;

}
