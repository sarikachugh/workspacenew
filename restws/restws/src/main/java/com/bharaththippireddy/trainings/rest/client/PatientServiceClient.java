package com.bharaththippireddy.trainings.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.bharaththippireddy.trainings.jaxrs.Patient;

public class PatientServiceClient {

	private static final String Patient_Service_URL = "http://localhost:8091/restws/services/patientservice";

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		// WebTarget target =
		// client.target("http://localhost:8091/restws/services/patientservice/patients/123");
		WebTarget target = client.target(Patient_Service_URL).path("/patients").path("/{id}").resolveTemplate("id",
				123);
		// Response response = target.request().get();
		Patient patient = target.request().get(Patient.class);
		System.out.println(patient.getName());

		WebTarget putTarget = client.target(Patient_Service_URL).path("/patients");
		patient.setName("Bharath");
		Response updateResponse = putTarget.request().put(Entity.entity(patient, MediaType.APPLICATION_XML));
		System.out.println(updateResponse.getStatus());
		// updateResponse.close();

		Patient newPatient = new Patient();
		newPatient.setName("Thippireddy");

		WebTarget postTarget = client.target(Patient_Service_URL).path("/patients");
		Patient postResponse = postTarget.request().post(Entity.entity(newPatient, MediaType.APPLICATION_XML),
				Patient.class);
		System.out.println(postResponse.getId());

		// WebTarget target = client.target("http://localhost:8091/restws/services/patientservice/patients/123");
		WebTarget deletetarget = client.target(Patient_Service_URL).path("/patients").path("/{id}").
					resolveTemplate("id", 125);
		Response deleteResponse = target.request().delete();
		//Patient patient = target.request().get(Patient.class);
		//System.out.println(patient.getName());
		System.out.println(deleteResponse.getStatus());
		// client.close();
	}

}
