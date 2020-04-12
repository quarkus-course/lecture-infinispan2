package tech.donau;

import io.quarkus.infinispan.client.Remote;
import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.RemoteCacheManager;
import tech.donau.data.Author;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Path("/books")
public class BookResource {

    @Inject
    @Remote("author")
    RemoteCache<String, Author> authorsCache;

    @Inject
    RemoteCacheManager remoteCacheManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
//        return remoteCacheManager.getCacheNames();
//        authorsCache.put("test", new Author("dmytro", "Chaban"));
        return authorsCache.get("test").getSurname();
    }

}