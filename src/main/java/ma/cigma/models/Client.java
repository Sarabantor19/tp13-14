package ma.cigma.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {

    private long id;
    private String name;
    public Client() {
    }

    public Client(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
