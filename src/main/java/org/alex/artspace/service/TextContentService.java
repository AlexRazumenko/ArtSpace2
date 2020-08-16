package org.alex.artspace.service;

import org.alex.artspace.entity.TextContent;
import org.alex.artspace.entity.User;

import java.util.List;
import java.util.Optional;

public interface TextContentService {

    TextContent createTextContent (TextContent content);
    TextContent updateTextContent (TextContent content);
    void deleteTextContent (Long id);
    TextContent getTextContentById (Long id);
    Optional<TextContent> findTextContentById (Long id);
    TextContent findTextContentByAuthor (User author);
    //    Optional<User> findUserByEmail (String email);
    User findUserByName (String name);
    List<User> findAllUsers();



}
