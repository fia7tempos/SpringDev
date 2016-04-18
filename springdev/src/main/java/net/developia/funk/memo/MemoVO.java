package net.developia.funk.memo;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class MemoVO implements Serializable{
	private long no;
	private String regdate;
	
	@NotBlank
	private String title;
	
	@Length(min=2, max=6)
	@Pattern(regexp="[a-z0-9ㄱ-ㅎ가-힣]+")
	private String name;
	
	
	@Length(min=1, max=128)
	private String pwd;
	
	@NotBlank
	private String content;
	
	@Email
	private String email;

	public long getNo() {
		return no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = DigestUtils.sha512Hex(pwd);
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MemoVO [no=" + no + ", regdate=" + regdate + ", title=" + title + ", name=" + name + ", pwd=" + pwd
				+ ", content=" + content + ", email=" + email + "]";
	}
	
	

	
	
	
}
