package com.ysh.dubbox.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.ysh.dubbox.api.model.User;

@Path("u")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public interface UserService {
	
	@GET
    @Path("findall")
	List<User> findAll();
	
	@POST
    @Path("create")
	String create(User user);
}
