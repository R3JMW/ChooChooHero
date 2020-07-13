package com.cch.controller;

import com.cch.model.Comment;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @GetMapping("/{contentId}")
    public List<Comment> searchComments(
            @PathVariable() Long contentId,
            @RequestParam int page,
            @RequestParam int size
    ) {
        return Collections.emptyList();
    }

    @PostMapping("/{contentId}")
    public int addComment(@PathVariable Long contentId, @RequestBody Comment comment) {
        return 0;
    }

    @PutMapping("/{contentId}")
    public int updateComment(@PathVariable Long contentId, @RequestBody Comment comment) {
        return 0;
    }

    @DeleteMapping("/{contentId}/{commentId}")
    public int deleteComment(@PathVariable Long contentId, @PathVariable Long commentId) {
        return 0;
    }
}
