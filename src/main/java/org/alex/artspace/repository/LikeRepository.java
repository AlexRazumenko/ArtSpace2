package org.alex.artspace.repository;

import org.alex.artspace.entity.Content;
import org.alex.artspace.entity.Like;
import org.alex.artspace.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikeRepository extends JpaRepository<Like, Long> {

    public List<Like> findAllByAuthorOrderByDate(User author);

    public List<Like> findAllByContentOrderByDate (Content content);

}
