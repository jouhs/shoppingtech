package fr.jouhs.shoptechbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.jouhs.shoptechbackend.dao.CategoryDAO;
import fr.jouhs.shoptechbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<Category>();
	static {
		Category category = new Category();

		category.setId(1);
		category.setName("Televesion");
		category.setDescription("Cecci est la description des teles");
		category.setImageURL("CAT_1.png");

		categories.add(category);

		// second category
		category = new Category();

		category.setId(2);
		category.setName("PC");
		category.setDescription("Cecci est la description des PC");
		category.setImageURL("CAT_2.png");

		categories.add(category);
		// second category
		category = new Category();

		category.setId(3);
		category.setName("Telephone");
		category.setDescription("Cecci est la description des Telephones");
		category.setImageURL("CAT_3.png");

		categories.add(category);

	}

	@Override
	public List<Category> list() {
		return categories;
	}

	@Override
	public Category get(int id) {
		return categories.stream()
				.filter(cat -> cat.getId() == id)
				.findAny()
				.orElse(null);
	}

}
