package org.da0hn.poc.application.resources.responses;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Response<T> {
  T data;
  String message;
  boolean success;
}
