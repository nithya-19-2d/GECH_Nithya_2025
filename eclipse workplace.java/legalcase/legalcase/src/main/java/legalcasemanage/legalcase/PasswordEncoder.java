package legalcasemanage.legalcase;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode("admin@12"));
		
	}
}
