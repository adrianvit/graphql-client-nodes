package com.example.graphqlclientnodes;

import io.aexp.nodes.graphql.annotations.GraphQLVariable;

public class Query {

  @GraphQLVariable(name = "id", scalar = "ID")
  public Book bookById;
}
