package com.email.wxlemail;

import com.email.wxlemail.kits.email.EmailKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WxlEmailApplication {

	@Autowired
	EmailKit emailKit;








	public static void main(String[] args) {
		SpringApplication.run(WxlEmailApplication.class, args);
	}

	@RequestMapping("/sendEmail")
	public void sendMail(){
		 emailKit.sendEmail();
	}
}
