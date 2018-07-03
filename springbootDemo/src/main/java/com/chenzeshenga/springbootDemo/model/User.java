package com.chenzeshenga.springbootDemo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@ApiModel("user-model")
@AllArgsConstructor
@Getter
public class User {

	@ApiModelProperty("user-id")
	private int id;
	@ApiModelProperty("user-name")
	private String name;
	@ApiModelProperty("user-password")
	private String password;

}
