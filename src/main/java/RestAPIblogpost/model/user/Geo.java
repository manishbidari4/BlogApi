package RestAPIblogpost.model.user;

import RestAPIblogpost.model.audit.UserDateAudit;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serial;
import java.time.Instant;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@Table(name = "geo")
public class Geo extends UserDateAudit {
	@Serial
	private static final long serialVersionUID = 2669293150219020249L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "lat")
	private String lat;

	@Column(name = "lng")
	private String lng;

	@OneToOne(mappedBy = "geo")
	private Address address;

	public Geo(String lat, String lng) {
		this.lat = lat;
		this.lng = lng;
	}

	@Override
	public Long getCreatedBy() {
		return super.getCreatedBy();
	}

	@Override
	public void setCreatedBy(Long createdBy) {
		super.setCreatedBy(createdBy);
	}


	@Override
	public Long getUpdatedBy() {
		return super.getUpdatedBy();
	}

	@Override
	public void setUpdatedBy(Long updatedBy) {
		super.setUpdatedBy(updatedBy);
	}

	@Override
	public Instant getCreatedAt() {
		return super.getCreatedAt();
	}

	@Override
	public void setCreatedAt(Instant createdAt) {
		super.setCreatedAt(createdAt);
	}

	@Override
	public Instant getUpdatedAt() {
		return super.getUpdatedAt();
	}

	@Override
	public void setUpdatedAt(Instant updatedAt) {
		super.setUpdatedAt(updatedAt);
	}
}
