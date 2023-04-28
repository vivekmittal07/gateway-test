package com.test;

import ca.uhn.fhir.context.FhirContext;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.google.fhir.gateway.HttpFhirClient;
import com.google.fhir.gateway.interfaces.AccessChecker;
import com.google.fhir.gateway.interfaces.AccessCheckerFactory;
import com.google.fhir.gateway.interfaces.AccessDecision;
import com.google.fhir.gateway.interfaces.PatientFinder;
import com.google.fhir.gateway.interfaces.RequestDetailsReader;
import javax.inject.Named;

public class DemoAccessChecker implements AccessChecker {

  public AccessDecision checkAccess(RequestDetailsReader requestDetailsReader) {
    return new DemoAccessDecision();
  }

  @Named(value = "demo")
  public static class Factory implements AccessCheckerFactory {

    public AccessChecker create(
        DecodedJWT jwt,
        HttpFhirClient httpFhirClient,
        FhirContext fhirContext,
        PatientFinder patientFinder) {
      return new DemoAccessChecker();
    }
  }
}
