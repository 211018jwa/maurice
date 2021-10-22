package com.revature.app;

import com.revature.cotroller.ArithmeticController;
import com.revature.service.ArithmeticService;

import io.javalin.Javalin;

public class Application {

	public static void main(String[] args) {
		
		//Setting up the method to handle the Jetty webserver
		Javalin app = Javalin.create();
		
		//Instantiate the controller
		ArithmeticController controller = new ArithmeticController(new ArithmeticService());
		controller.registerEndpoint(app);
		
		app.start(8080);
	}

}
