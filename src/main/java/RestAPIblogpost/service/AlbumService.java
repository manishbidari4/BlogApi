package RestAPIblogpost.service;

import RestAPIblogpost.payload.request.AlbumRequest;
import RestAPIblogpost.model.Album;
import RestAPIblogpost.payload.AlbumResponse;
import RestAPIblogpost.payload.ApiResponse;
import RestAPIblogpost.payload.PagedResponse;
import RestAPIblogpost.security.UserPrincipal;
import org.springframework.http.ResponseEntity;

public interface AlbumService {

	PagedResponse<AlbumResponse> getAllAlbums(int page, int size);

	ResponseEntity<Album> addAlbum(AlbumRequest albumRequest, UserPrincipal currentUser);

	ResponseEntity<Album> getAlbum(Long id);

	ResponseEntity<AlbumResponse> updateAlbum(Long id, AlbumRequest newAlbum, UserPrincipal currentUser);

	ResponseEntity<ApiResponse> deleteAlbum(Long id, UserPrincipal currentUser);

	PagedResponse<Album> getUserAlbums(String username, int page, int size);

}
