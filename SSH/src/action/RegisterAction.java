package action;

import model.Users;
import util.Login;
import util.Register;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
	private Users user;
	private String info;
	@Override
	public String execute()throws Exception{
		
		if(user.getUsername().length()==0){
		    this.addFieldError("user", "用户名不能为空！");
		    return ERROR;
		}
		else if(user.getUsername().length()<3){
		    this.addFieldError("user", "用户名太短！");
		    return ERROR;
		}
		else if(user.getUsername().length()>12){
			this.addFieldError("user", "用户名太长！");
			return ERROR;
		}
		else if(!user.getPassword().equals(user.getRepassword())){
			this.addFieldError("user", "两次密码输入不一致！");
			return ERROR;
		}
		else if(Register.val(user.getUsername())){
			this.addFieldError("user", "此用户已存在！");
			return ERROR;
		}
		else{
			Register.reg(user.getUsername(), user.getPassword());
			return SUCCESS;
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
