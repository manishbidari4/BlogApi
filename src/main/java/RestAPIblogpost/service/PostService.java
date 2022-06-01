package RestAPIblogpost.service;

import RestAPIblogpost.model.Post;
import RestAPIblogpost.payload.ApiResponse;
import RestAPIblogpost.payload.PagedResponse;
import RestAPIblogpost.payload.PostRequest;
import RestAPIblogpost.payload.PostResponse;
import RestAPIblogpost.security.UserPrincipal;

public interface PostService {

	PagedResponse<Post> getAllPosts(int page, int size);

	PagedResponse<Post> getPostsByCreatedBy(String username, int page, int size);

	PagedResponse<Post> getPostsByCategory(Long id, int page, int size);

	PagedResponse<Post> getPostsByTag(Long id, int page, int size);

	Post updatePost(Long id, PostRequest newPostRequest, UserPrincipal currentUser);

	ApiResponse deletePost(Long id, UserPrincipal currentUser);

	PostResponse addPost(PostRequest postRequest, UserPrincipal currentUser);

	Post getPost(Long id);

}
