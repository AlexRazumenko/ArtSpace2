package org.alex.artspace.service;

import org.alex.artspace.entity.Content;
import org.alex.artspace.entity.User;

import java.util.List;
import java.util.Optional;

public interface ContentService {

    Content createContent (Content content, User author);
    Content updateContent (Content content);
    void deleteContent(Long id);
    Content getContentById(Long id);
    Optional<Content> findContentById(Long id);
    List<Content> findContentByAuthor (User author);
    List<Content> getAllContents();


}
