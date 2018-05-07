import javax.ejb.Stateless;

@Stateless
public class EjbUnsecured {

    public String test() {
        return "OK";
    }

}
