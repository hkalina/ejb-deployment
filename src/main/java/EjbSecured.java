import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;

@Stateless
@RolesAllowed("admin")
public class EjbSecured {

    public String test() {
        return "OK";
    }

}
