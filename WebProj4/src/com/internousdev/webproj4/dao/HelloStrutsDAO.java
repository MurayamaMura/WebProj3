package com.internousdev.webproj4.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.webproj4.dto.HelloStrutsDTO;
import com.internousdev.webproj4.util.DBConnector;

public class HelloStrutsDAO {
	List<HelloStrutsDTO>helloStrutsDTOList=new ArrayList<HelloStrutsDTO>();

	public List<HelloStrutsDTO>select(){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();




		return helloStrutsDTOList;

	}

}

