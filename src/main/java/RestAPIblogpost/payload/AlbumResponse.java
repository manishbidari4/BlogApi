package RestAPIblogpost.payload;

import RestAPIblogpost.model.Photo;
import RestAPIblogpost.model.user.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonInclude(Include.NON_NULL)
public class AlbumResponse extends UserDateAuditPayload {
	private Long id;

	private String title;

	private User user;

	private List<Photo> photo;

}
