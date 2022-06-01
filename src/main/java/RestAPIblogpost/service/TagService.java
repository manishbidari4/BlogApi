package RestAPIblogpost.service;

import RestAPIblogpost.model.Tag;
import RestAPIblogpost.payload.ApiResponse;
import RestAPIblogpost.payload.PagedResponse;
import RestAPIblogpost.security.UserPrincipal;

public interface TagService {

	PagedResponse<Tag> getAllTags(int page, int size);

	Tag getTag(Long id);

	Tag addTag(Tag tag, UserPrincipal currentUser);

	Tag updateTag(Long id, Tag newTag, UserPrincipal currentUser);

	ApiResponse deleteTag(Long id, UserPrincipal currentUser);

}
