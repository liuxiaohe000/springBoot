package com.lxh;

import com.lxh.pojo.User;
import com.lxh.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InitializationApplicationTests {

	@Resource
	private UserService userService;

	@Test
	public void test1() {
		User user = userService.getUserById(1);
		System.out.println(user.toString());
	}

}
