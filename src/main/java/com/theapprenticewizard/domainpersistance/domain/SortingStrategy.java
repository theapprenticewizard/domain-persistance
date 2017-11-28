package com.theapprenticewizard.domainpersistance.domain;

import java.util.List;

public interface SortingStrategy {
    List<Post> sort(List<Post> posts);
}
