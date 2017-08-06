package net.kzn.shopsbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import net.kzn.shopsbackend.dao.CategoryDAO;
import net.kzn.shopsbackend.dto.Category;

public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>();
	
	static{
		//first category
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for television");
		category.setImageURL("CAT_1.png");
		categories.add(category);
		
		//second category
				category = new Category();
				category.setId(2);
				category.setName("Mobile");
				category.setDescription("This is some description for Mobile");
				category.setImageURL("CAT_2.png");
				categories.add(category);
		
				//third category
				category = new Category();
				category.setId(3);
				category.setName("Laptop");
				category.setDescription("This is some description for Laptop");
				category.setImageURL("CAT_3.png");
				categories.add(category);
		
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
