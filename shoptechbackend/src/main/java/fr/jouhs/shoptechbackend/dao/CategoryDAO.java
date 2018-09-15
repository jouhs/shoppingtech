package fr.jouhs.shoptechbackend.dao;

import java.util.List;

import fr.jouhs.shoptechbackend.dto.Category;

public interface CategoryDAO {
	List<Category> list();

	Category get(int id);
}
