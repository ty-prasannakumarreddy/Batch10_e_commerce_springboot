package com.te.springbootecommerce.dao;

import java.util.List;

import com.te.springbootecommerce.bean.ItemBean;

public interface AdminDAO {

	public ItemBean getEmpData(Integer aid);

	public boolean addItem(ItemBean Bean);

	public boolean updateItem(ItemBean infoBean);

	public boolean deleteItem(Integer id);

	public List<ItemBean> getAllEmployeeDetails();

}
