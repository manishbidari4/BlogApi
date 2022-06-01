package RestAPIblogpost.model.audit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serial;

@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
@Data
@JsonIgnoreProperties(
		value = { "createdBY", "updatedBy" },
		allowGetters = true
)
public abstract class UserDateAudit extends DateAudit {
	@Serial
	private static final long serialVersionUID = 2669293150219020249L;

	@CreatedBy
	@Column(updatable = false)
	private Long createdBy;

	@LastModifiedBy
	private Long updatedBy;
}
