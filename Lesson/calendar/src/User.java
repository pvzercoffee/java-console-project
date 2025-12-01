import java.util.LinkedList;
import java.util.List;

public class User {
    private Integer id;
    private Status[] status;

    public User(Status[] status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Status[] getStatus() {
        return status;
    }

    public void setStatus(Status[] status) {
        this.status = status;
    }
}
