package com.brave.chockpaler.items.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

//import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.brave.chockpaler.items.dao.ItemsDao;
import com.brave.chockpaler.items.dto.ItemsDto;
import com.brave.chockpaler.util.pageUtil;

@Service
public class ItemsServiceImpl implements ItemsService {
	
	@Autowired
	private ItemsDao dao;

	@Override
	public ItemsDto getItemData(int num) {
		
		return dao.getData(num);
		
	}

	@Override
	public List<ItemsDto> getItemList(pageUtil util) {
		return dao.getList(util);
	}

	@Override
	public int getItemCount() {
		return dao.getCount();
	}

	@Override
	public void insert(ItemsDto dto,HttpServletRequest request) {
		dao.insert(dto);
		
	}
}


