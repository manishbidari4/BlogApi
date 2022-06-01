package RestAPIblogpost.service;

import RestAPIblogpost.exception.UnauthorizedException;
import RestAPIblogpost.model.Category;
import RestAPIblogpost.payload.ApiResponse;
import RestAPIblogpost.payload.PagedResponse;
import RestAPIblogpost.security.UserPrincipal;
import org.springframework.http.ResponseEntity;

public interface CategoryService {

	PagedResponse<Category> getAllCategories(int page, int size);

	ResponseEntity<Category> getCategory(Long id);

	ResponseEntity<Category> addCategory(Category category, UserPrincipal currentUser);

	ResponseEntity<Category> updateCategory(Long id, Category newCategory, UserPrincipal currentUser)
			throws UnauthorizedException;

	ResponseEntity<ApiResponse> deleteCategory(Long id, UserPrincipal currentUser) throws UnauthorizedException;

}
