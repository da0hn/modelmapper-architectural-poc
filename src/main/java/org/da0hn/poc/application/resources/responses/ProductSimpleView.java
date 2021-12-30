package org.da0hn.poc.application.resources.responses;


public record ProductSimpleView(
  String id,
  Double price,
  String name
) {
}
