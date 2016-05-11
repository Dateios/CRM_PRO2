package entity;

import org.springframework.stereotype.Repository;

/**
 * Created by ’≈∫Ω on 2016/5/10.
 */
@Repository
public class User {
    private  int id;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
