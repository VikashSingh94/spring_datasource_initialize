package rc.dbinitdemo.models;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Student.class, name = "student"),
        @JsonSubTypes.Type(value = Teacher.class, name = "teacher")})
public abstract class Owner {
    private Integer id;

    public Owner(Integer id) {
        this.id = id;
    }

    public Owner() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

