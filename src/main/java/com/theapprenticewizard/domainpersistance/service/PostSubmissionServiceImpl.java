package com.theapprenticewizard.domainpersistance.service;

import com.theapprenticewizard.domainpersistance.domain.Blog;
import com.theapprenticewizard.domainpersistance.domain.Post;
import com.theapprenticewizard.domainpersistance.persistance.BlogRepository;
import org.springframework.stereotype.Service;

@Service
public class PostSubmissionServiceImpl implements PostSubmissionService {

    private final BlogRepository blogRepository;

    public PostSubmissionServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public void submitPost(Post post) {
        Blog blog = new Blog();
        blog.submitPost(post);
    }
}
