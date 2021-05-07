package com.FirstApp.apll.repo;

import com.FirstApp.apll.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {
}
