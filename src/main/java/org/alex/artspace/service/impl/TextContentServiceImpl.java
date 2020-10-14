package org.alex.artspace.service.impl;

import org.alex.artspace.entity.TextContent;
import org.alex.artspace.entity.User;
import org.alex.artspace.repository.ContentRepository;
import org.alex.artspace.service.TextContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TextContentServiceImpl implements TextContentService {

    private ContentRepository contentRepository;

    @Autowired
    public TextContentServiceImpl(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    @Override
    public TextContent createTextContent(TextContent content) {
        return contentRepository.saveAndFlush(content);
    }

    @Override
    public TextContent updateTextContent(TextContent content) {
        return contentRepository.save(content);
    }

    @Override
    public void deleteTextContent(Long id) {
contentRepository.deleteById(id);
    }

    @Override
    public TextContent getTextContentById(Long id) {
        return contentRepository.findContentById(id);
    }

    @Override
    public Optional<TextContent> findTextContentById(Long id) {
        return Optional.empty();
    }

    @Override
    public TextContent findTextContentByAuthor(User author) {
        return null;
    }

    @Override
    public User findUserByName(String name) {
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }
}
