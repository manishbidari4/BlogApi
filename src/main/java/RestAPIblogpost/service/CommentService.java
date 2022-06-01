package RestAPIblogpost.service;

import RestAPIblogpost.model.Comment;
import RestAPIblogpost.payload.ApiResponse;
import RestAPIblogpost.payload.CommentRequest;
import RestAPIblogpost.payload.PagedResponse;
import RestAPIblogpost.security.UserPrincipal;

public interface CommentService {

	PagedResponse<Comment> getAllComments(Long postId, int page, int size);

	Comment addComment(CommentRequest commentRequest, Long postId, UserPrincipal currentUser);

	Comment getComment(Long postId, Long id);

	Comment updateComment(Long postId, Long id, CommentRequest commentRequest, UserPrincipal currentUser);

	ApiResponse deleteComment(Long postId, Long id, UserPrincipal currentUser);

}
