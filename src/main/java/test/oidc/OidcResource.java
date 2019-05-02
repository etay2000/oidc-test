package test.oidc;

import io.helidon.security.SecurityContext;
import io.helidon.security.annotations.Authenticated;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

@Path("/test")
public class OidcResource {

    @Authenticated
    @GET
    public Response getMerchants(@Context SecurityContext securityContext) {
        return Response.ok("Hello Test").build();
    }

}
