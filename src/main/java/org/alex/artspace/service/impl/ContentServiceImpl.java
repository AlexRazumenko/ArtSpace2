package org.alex.artspace.service.impl;

import org.alex.artspace.entity.Content;
import org.alex.artspace.entity.User;
import org.alex.artspace.repository.ContentRepository;
import org.alex.artspace.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContentServiceImpl implements ContentService {

    //    @Autowired
    private ContentRepository contentRepository;

    @Autowired
    public ContentServiceImpl(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }


    @Override
    public List<Content> getAllContents() {
        return contentRepository.findAll();
    }

    @Override
    public Content createContent(Content content, User author) {
        content.setAuthor(author);
        return contentRepository.save(content);
    }

    @Override
    public Content updateContent(Content content) {
        return contentRepository.save(content);
    }

    @Override
    public void deleteContent(Long id) {
        contentRepository.deleteById(id);
    }

    @Override
    public Content getContentById(Long id) throws ClassCastException {
        return contentRepository.findContentById(id);
    }

//    @Override
//    public Content findTextContentById(Long id) throws ClassCastException {
//        return contentRepository.findContentById(id);
//    }

    @Override
    public List<Content> findContentByAuthor(User author) {

        return   contentRepository.findContentsByAuthor(author);
    }

    @Override
    public Optional<Content> findContentById(Long id) {
        return contentRepository.findById(id);
    }


}
