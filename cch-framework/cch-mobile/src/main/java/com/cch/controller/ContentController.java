package com.cch.controller;

import com.cch.model.Content;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/content")
public class ContentController {

    @GetMapping
    public List<Content> searchContents(
            @RequestParam int page,
            @RequestParam int size
    ) {
        return Collections.emptyList();
    }

    @GetMapping("/{id}")
    public Content getContentById(
            @PathVariable long id
    ) {
        return null;
    }

    @PostMapping
    public void addContent(@RequestBody Content content) {

    }

    @PutMapping
    public void updateContent() {}

    @DeleteMapping
    public void deleteContent() {}
}
