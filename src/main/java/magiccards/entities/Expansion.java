package magiccards.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "magicexpansion")
public class Expansion {
	@Id
	@Column(name = "expansionid")
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
	
	@Column(name = "launchdate", columnDefinition = "date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate launchDate;
	
	@Column(name = "expansioncategoryid", columnDefinition = "smallint")
	private Integer expansionCategoryId;
	
	@Column(name = "ispromo", columnDefinition = "bit(1)")
	private Boolean isPromo;
	
	@Column(name = "islegal", columnDefinition = "bit(1)")
	private Boolean isLegal;

}
