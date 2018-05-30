package rc.dbinitdemo.entity;

import rc.dbinitdemo.models.Owner;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class OwnerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    public OwnerEntity(int id) {
        this.id = id;
    }

    public OwnerEntity() {
    }

    public OwnerEntity(Owner owner) {
        if (owner.getId() != null) {
            this.id = owner.getId();
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
