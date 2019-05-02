
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Valid;

@Entity
@Access(AccessType.PROPERTY)
@Table(indexes = {
	@Index(columnList = "hacker")
})
public class Curricula extends DomainEntity {

	//--------Atributos propios
	private boolean	original;

	//--------Relaciones
	private Hacker	hacker;


	@ManyToOne(optional = true)
	@Valid
	public Hacker getHacker() {
		return this.hacker;
	}

	public void setHacker(final Hacker hacker) {
		this.hacker = hacker;
	}

	public boolean getOriginal() {
		return this.original;
	}

	public void setOriginal(final boolean original) {
		this.original = original;
	}

}
