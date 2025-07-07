package legalcasemanage.legalcase.Configuration;

import java.io.IOException;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class Customsucesshandler implements AuthenticationSuccessHandler {
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		//collection<? extens Granted Authority> authentication = authentication.
				var authorities = authentication.getAuthorities();
				request.getSession().setAttribute("success", "Login successfull !!!");
				if(authorities.stream().anyMatch(a -> a.getAuthority().equals("ROLE_LAWYER"))) {
					response.sendRedirect("/lawyer_dashboard");
				}else if(authorities.stream().anyMatch(a -> a.getAuthority().equals("ROLE_CLIENT"))){
					response.sendRedirect("/client_dashboard");
				}
				else if(authorities.stream().anyMatch(a -> a.getAuthority().equals("ROLE_ADMIN"))){
					response.sendRedirect("/admin");
				}
//				else {
//					response.sendRedirect("error");
//				}
		
	}


}
