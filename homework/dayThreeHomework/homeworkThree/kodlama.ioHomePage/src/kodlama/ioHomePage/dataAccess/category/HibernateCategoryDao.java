package kodlama.ioHomePage.dataAccess.category;

import kodlama.ioHomePage.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile Veri tabanın eklendi.");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Hibernate ile Veri tabanın'dan silindi.");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Hibernate ile Veri tabanın'da güncellendi.");
		
	}

}
