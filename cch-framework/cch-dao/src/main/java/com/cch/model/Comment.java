package com.cch.model;

import java.sql.Timestamp;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.comment.id
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.comment.comment_id
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    private Long commentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.comment.content_id
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    private Long contentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.comment.comment
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    private String comment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.comment.user_id
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.comment.comment_date
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    private Timestamp commentDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.comment.id
     *
     * @return the value of public.comment.id
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.comment.id
     *
     * @param id the value for public.comment.id
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.comment.comment_id
     *
     * @return the value of public.comment.comment_id
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public Long getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.comment.comment_id
     *
     * @param commentId the value for public.comment.comment_id
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.comment.content_id
     *
     * @return the value of public.comment.content_id
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public Long getContentId() {
        return contentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.comment.content_id
     *
     * @param contentId the value for public.comment.content_id
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.comment.comment
     *
     * @return the value of public.comment.comment
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.comment.comment
     *
     * @param comment the value for public.comment.comment
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.comment.user_id
     *
     * @return the value of public.comment.user_id
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.comment.user_id
     *
     * @param userId the value for public.comment.user_id
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.comment.comment_date
     *
     * @return the value of public.comment.comment_date
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public Timestamp getCommentDate() {
        return commentDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.comment.comment_date
     *
     * @param commentDate the value for public.comment.comment_date
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public void setCommentDate(Timestamp commentDate) {
        this.commentDate = commentDate;
    }
}