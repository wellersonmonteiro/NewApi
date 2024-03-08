package dio.web.api.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public class Usuario {
    @EqualsAndHashCode.Include
    private Integer id;
    private String login;
    private String password;

    public Usuario() {
    }

    public Usuario( String login, String password) {
        this.login = login;
        this.password = password;
    }
    public String toString(){
        return "User{"+
                "login= '"+ login + '\''+
                ",password='" + password + '\''+
                        '}';
    }

}
