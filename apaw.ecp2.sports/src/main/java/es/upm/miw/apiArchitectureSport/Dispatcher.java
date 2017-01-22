package es.upm.miw.apiArchitectureSport;

import es.upm.miw.apiArchitectureSport.api.SportResource;
import es.upm.miw.apiArchitectureSport.api.UserResource;
import es.upm.miw.apiArchitectureSport.exceptions.InvalidRequestException;
import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;
import es.upm.miw.web.http.HttpStatus;

public class Dispatcher {

	private SportResource sportResource = new SportResource();
	private UserResource userResource = new UserResource();

	private void responseError(HttpResponse response, Exception e) {
		response.setBody("{\"error\":\"" + e + "\"}");
		response.setStatus(HttpStatus.BAD_REQUEST);
	}

	public void doGet(HttpRequest request, HttpResponse response) {
		if ("users".equals(request.getPath())) {
			response.setBody(userResource.userList().toString());

		}
		else if (("users".equals(request.paths()[0])) && ("search".equals(request.paths()[1]))) {
			try {
				String paramSport = (request.getParams()).get("sport");
				if (paramSport == null) {
					responseError(response, new InvalidRequestException(request.getPath()));
				} else {
					response.setBody(userResource.userList(paramSport).toString());
				}
			} catch (Exception e) {
				responseError(response, e);
			}
		} else {
			responseError(response, new InvalidRequestException(request.getPath()));
		}
	}

	public void doPost(HttpRequest request, HttpResponse response) {
		switch (request.getPath()) {
		case "users":
			try {
				String nick = request.getBody().split(":")[0];
				String email = request.getBody().split(":")[1];
				userResource.createUser(nick, email);
				response.setStatus(HttpStatus.CREATED);
			} catch (Exception e) {
				this.responseError(response, e);
			}
			break;
		case "sports":
			try {
				sportResource.createSport(request.getBody());
				response.setStatus(HttpStatus.CREATED);
			} catch (Exception e) {
				this.responseError(response, e);
			}
			break;
		default:
			responseError(response, new InvalidRequestException(request.getPath()));
			break;
		}
	}

	public void doPut(HttpRequest request, HttpResponse response) {
		if (("users".equals(request.paths()[0])) && ("sport".equals(request.paths()[2]))) {
			try {
				userResource.update(request.paths()[1], request.getBody());
				response.setStatus(HttpStatus.OK);
			} catch (Exception e) {
				responseError(response, e);
			}
		} else {
			responseError(response, new InvalidRequestException(request.getPath()));
		}
	}

	public void doDelete(HttpRequest request, HttpResponse response) {
		switch (request.getPath()) {
		default:
			responseError(response, new InvalidRequestException(request.getPath()));
			break;
		}
	}

}
