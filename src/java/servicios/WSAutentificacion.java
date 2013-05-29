
package servicios;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jalmenarez
 */
@WebService(serviceName = "WSAutentificacion")
public class WSAutentificacion {

    @WebMethod(operationName = "autenticarLogin")
    public boolean autentificarLogin(@WebParam(name = "username") String username,
                                     @WebParam(name = "password") String password) {
        boolean response = false;
        if(username.equalsIgnoreCase("alpha") && password.equalsIgnoreCase("12345")){
         response = true;    
        }else{
         response = false;
        }
        return response;
    }

}
