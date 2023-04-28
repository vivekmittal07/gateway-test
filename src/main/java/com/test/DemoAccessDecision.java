package com.test;

import com.google.fhir.gateway.interfaces.AccessDecision;
import com.google.fhir.gateway.interfaces.RequestDetailsReader;
import com.google.fhir.gateway.interfaces.RequestMutation;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.jetbrains.annotations.Nullable;

public class DemoAccessDecision implements AccessDecision {

  public boolean canAccess() {
    return true;
  }

  @Nullable
  public RequestMutation getRequestMutation(RequestDetailsReader requestDetailsReader) {
    return null;
  }

  public String postProcess(HttpResponse httpResponse) throws IOException {
    return null;
  }
}
