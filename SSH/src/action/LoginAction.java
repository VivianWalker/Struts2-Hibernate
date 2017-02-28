package action;

import model.Users;
import util.Login;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private Users user;
	private String info;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(Login.validate(user.getUsername(),user.getPassword())){
			info = "登录成功！";
			return SUCCESS;
		}else{
			info = "用户名或密码不正确！";
			return ERROR;
		}
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}	
	
}
