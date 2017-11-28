package com.theapprenticewizard.domainpersistance.domain;

import com.theapprenticewizard.domainpersistance.AggregateRoot;

import java.util.List;

@AggregateRoot
public class Blog {
    private transient SortingStrategy sortingStrategy;

    private List<Post> posts;

    public void submitPost(Post post) {

    }

    public Post nextPost() {
        return new Post();
    }
}
