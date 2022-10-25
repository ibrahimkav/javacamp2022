package kodlama.ioHomePage.business;

import kodlama.ioHomePage.core.logging.Logger;
import kodlama.ioHomePage.dataAccess.category.CategoryDao;
import kodlama.ioHomePage.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	Category[] categorys = new Category {"Programlama", "Diğer", "Tümü"};	

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {

		if (category.getCategoryName().equals(category.getCategoryName())) {
			throw new Exception("Kategori ismi tekrar edemez.");
		}
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}

	}

}
