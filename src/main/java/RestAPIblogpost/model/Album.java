package RestAPIblogpost.model;

import RestAPIblogpost.model.audit.UserDateAudit;
import RestAPIblogpost.model.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serial;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "albums", uniqueConstraints = { @UniqueConstraint(columnNames = { "title" }) })
public class Album extends UserDateAudit {
	@Serial
	private static final long serialVersionUID = 2669293150219020249L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Column(name = "title")
	private String title;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	@ToString.Exclude
	private User user;

	@OneToMany(mappedBy = "album", cascade = CascadeType.ALL, orphanRemoval = true)
	@ToString.Exclude
	private List<Photo> photo;

	@JsonIgnore
	public User getUser() {
		return user;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		Album album = (Album) o;
		return id != null && Objects.equals(id, album.id);
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}
