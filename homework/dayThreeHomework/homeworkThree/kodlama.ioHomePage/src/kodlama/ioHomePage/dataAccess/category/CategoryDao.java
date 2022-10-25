package kodlama.ioHomePage.dataAccess.category;

import kodlama.ioHomePage.entities.Category;

public interface CategoryDao {
	public void add(Category category);
	public void delete(Category category);
	public void update (Category category);
}
