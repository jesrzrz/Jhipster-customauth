package es.jr.jhipster.customauth.security.nks;

import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

public class NksAuthenticationManagerBuilder extends AuthenticationManagerBuilder {

	public NksAuthenticationManagerBuilder(ObjectPostProcessor<Object> objectPostProcessor) {
		super(objectPostProcessor);
		// TODO Auto-generated constructor stub
	}

}
