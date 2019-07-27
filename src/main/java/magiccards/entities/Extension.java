package magiccards.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "magicextension")
public class Extension {
	@Id
	@Column(name = "expansionId")
	private Integer expansionId;
	@Column(name = "name", columnDefinition = "text")
	private String name;
	@Column(name = "ptbrname", columnDefinition = "text", nullable = true)
	private String ptBrName;
	@Column(name = "linkname", columnDefinition = "text")
	private String linkName;
	@Column(name = "searchname", columnDefinition = "text")
	private String searchName;
	@Column(name = "code")
	private String code;
	@Column(name = "launchDate", columnDefinition = "date")
	private LocalDate launchDate;
	@Column(name = "expansionCategoryId", columnDefinition = "smallint")
	private Integer expansionCategoryId;
	@Column(name = "isPromo", columnDefinition = "bit", nullable = true)
	private Boolean isPromo;
	@Column(name = "isLegal", columnDefinition = "bit", nullable = true)
	private Boolean isLegal;

}
