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
			info = "��¼�ɹ���";
			return SUCCESS;
		}else{
			info = "�û��������벻��ȷ��";
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
