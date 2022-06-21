package com.brave.chockpaler.items.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.brave.chockpaler.items.dto.ItemsDto;
import com.brave.chockpaler.util.pageUtil;

@Repository
public class ItemsDaoImpl implements ItemsDao {
	@Autowired
	private SqlSession session;

	@Override
	public ItemsDto getData(int num) {
		return session.selectOne("Items.getData", num); // 내가 이래뵈도 ItemDto야 
	}

	@Override
	public List<ItemsDto> getList(pageUtil util) {
		return session.selectList("Items.getList", util);
	}

	@Override
	public int getCount() {
		return session.selectOne("Items.getItemCount");
	}

	@Override
	public void insert(ItemsDto dto) {
		session.insert("Items.insert", dto);

		
	}
	@Override
	public void delete(int num) {
		session.delete("Items.delete", num);
	}
}
