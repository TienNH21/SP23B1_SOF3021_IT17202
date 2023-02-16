package sof3021.form_beans.accounts;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AccountCreate {
	@NotBlank
	private String username;
	private String fullname;
	private String email;
	private String password;
	private String photo;
	private int activated;
	private int admin;
}
