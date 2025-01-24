package dev.redwoodlabs.undem.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dev.redwoodlabs.undem.db.Government;
import dev.redwoodlabs.undem.db.GovernmentRepository;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/governments")
public class GovernmentResource {

    private GovernmentRepository repository;
    
    public GovernmentResource(GovernmentRepository repository){
        this.repository = repository;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGovernments() {
        Iterator<Government> govItr = repository.findAll().iterator();
        List<Government> govs = new ArrayList<>();
        while (govItr.hasNext()){
            govs.add(govItr.next());
        }
        return Response.ok(govs).build();
    }
}
