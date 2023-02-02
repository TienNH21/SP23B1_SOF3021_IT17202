package sof3021;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import sof3021.beans.Company;

@Configuration
public class BeanConfig {
	@Bean("HN")
	public Company getCompany()
	{
		Company c = new Company("FPT Polytechnic HN");
		return c;
	}
	
	@Bean("HCM")
	public Company getCompany2()
	{
		Company c = new Company("FPT Polytechnic HCM");
		return c;
	}
}
