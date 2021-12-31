package org.da0hn.poc.application.resources.responses;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Response<T> {
  T data;
  String message;
  boolean success;

  public static <T> Response<T> success(final T data) {
    return Response.<T>builder()
      .data(data)
      .success(true)
      .message("Success")
      .build();
  }

}
