package com.example.graphqlclientnodes;

import io.aexp.nodes.graphql.GraphQLRequestEntity;
import io.aexp.nodes.graphql.GraphQLResponseEntity;
import io.aexp.nodes.graphql.GraphQLTemplate;
import io.aexp.nodes.graphql.Variable;

public class GraphqlClientNodesApplication {

  public static void main(String[] args) throws Exception{

    GraphQLTemplate graphQLTemplate = new GraphQLTemplate();

    GraphQLRequestEntity requestEntity = GraphQLRequestEntity.Builder()
        .url("http://localhost:8181/graphql")
        .variables(new Variable("id", "book-1"))
        .request(Query.class)
        .build();
    GraphQLResponseEntity<Query> responseEntity = graphQLTemplate.query(requestEntity, Query.class);

    System.out.println(responseEntity.getResponse().bookById);
  }

}
