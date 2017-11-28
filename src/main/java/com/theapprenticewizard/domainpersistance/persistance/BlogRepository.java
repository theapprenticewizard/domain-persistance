package com.theapprenticewizard.domainpersistance.persistance;

import com.theapprenticewizard.domainpersistance.domain.Blog;
import org.springframework.data.repository.Repository;

public interface BlogRepository extends Repository<Blog, String> {
    
}
