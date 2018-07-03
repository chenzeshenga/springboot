package com.chenzeshenga.springbootDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chenzeshenga.springbootDemo.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api("user api")
@RestController
@RequestMapping("/user")
public class UserController {

	@ApiOperation("get user by id")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "id", dataType = "int", required = true, value = "userId", defaultValue = "1") })
	@ApiResponses({ @ApiResponse(code = 400, message = "non param") })
	@RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
	public User getUserInfo(@RequestParam("id") int id) {
		return new User(1, "asd", "sdsf");
	}

}
