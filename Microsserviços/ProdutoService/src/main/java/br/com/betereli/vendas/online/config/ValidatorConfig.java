/**
 * 
 */
package br.com.betereli.vendas.online.config;


import javax.xml.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @author rodrigo.pires
 *
 */
@Configuration
public class ValidatorConfig {
	
//	@Autowired
//    ResourceBundleMessageSource messageSource;

	@Bean
    public LocalValidatorFactoryBean validatorFactory () {
		LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
//	    bean.setValidationMessageSource(messageSource);
	    return bean;
    }
}
