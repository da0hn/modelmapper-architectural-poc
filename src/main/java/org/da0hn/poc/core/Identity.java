package org.da0hn.poc.core;

import java.util.UUID;

public record Identity(String uuid) {
  public static Identity newIdentity() {
    return new Identity(UUID.randomUUID().toString());
  }
}
