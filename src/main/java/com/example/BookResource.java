package com.example;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;
import java.util.List;

import static javax.ws.rs.core.Response.Status.CREATED;

@Path("/book")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookResource {

    @GET
    public List<Book> getAllBooks() {
        return Collections.emptyList();
    }

    @POST
    @Transactional
    public Response create(Book book) {
        book.persist();
        return Response.ok(book).status(CREATED).build();
    }
}