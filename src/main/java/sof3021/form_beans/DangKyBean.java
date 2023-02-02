package sof3021.form_beans;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class DangKyBean {
	@NotBlank(message="Khong duoc de trong")
	private String ho_ten;
	private String nam_sinh;
	private String dia_chi;
	private String chuyen_nganh;
	
	public DangKyBean()
	{
		//
	}
	
	public DangKyBean(String ho_ten, String nam_sinh, String dia_chi, String chuyen_nganh) {
		super();
		this.ho_ten = ho_ten;
		this.nam_sinh = nam_sinh;
		this.dia_chi = dia_chi;
		this.chuyen_nganh = chuyen_nganh;
	}
	
	public String getHo_ten() {
		return ho_ten;
	}
	public void setHo_ten(String ho_ten) {
		this.ho_ten = ho_ten;
	}
	public String getNam_sinh() {
		return nam_sinh;
	}
	public void setNam_sinh(String nam_sinh) {
		this.nam_sinh = nam_sinh;
	}
	public String getDia_chi() {
		return dia_chi;
	}
	public void setDia_chi(String dia_chi) {
		this.dia_chi = dia_chi;
	}
	public String getChuyen_nganh() {
		return chuyen_nganh;
	}
	public void setChuyen_nganh(String chuyen_nganh) {
		this.chuyen_nganh = chuyen_nganh;
	}
	
	
}
