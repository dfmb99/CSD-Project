package api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/wallet")
public class WalletResource {
	 @POST
	 @Path("/receive")
	 @Consumes(MediaType.APPLICATION_JSON)
	 @Produces(MediaType.APPLICATION_JSON)
	 public void receiveCoins(@QueryParam("addr") String addr, @QueryParam("amount")double amount) {
		 
	 }
	 
	 @POST
	 @Path("/send")
	 @Consumes(MediaType.APPLICATION_JSON)
	 @Produces(MediaType.APPLICATION_JSON)
	 public void transferCoins(@QueryParam("addr") String addr, @QueryParam("amount")double amount) {
		 
	 }
	 
	 @GET
	 @Path("/{addr}")
	 @Produces(MediaType.APPLICATION_JSON)
	 public void getBalanceOf(@PathParam("addr") String addr) {
		 
	 }
	 
	 @GET
	 @Path("/blockchain")
	 @Produces(MediaType.APPLICATION_JSON)
	 public void getBlockChainData() {
		 
	 }
	 
	 @GET
	 @Path("/transactions/{addr}")
	 @Produces(MediaType.APPLICATION_JSON)
	 public void getTransactionsOf(@PathParam("addr") String addr) {
		 
	 }
	 
	 
}
