package com.xatu.project;

import java.util.ArrayList;
import java.util.List;

public class moee {
    public static void main(String[] args) {
		List<User> list=new ArrayList<User>();
		User user=new User();
		user.setName("����");
		user.setId(1);
		user.setAge(20);
		user.setType("�û�");
		list.add(user);
		Label l=new Label();
		l.model(list);
	}
}
