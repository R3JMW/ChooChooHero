package com.cch.model;

import java.sql.Timestamp;

public class Content {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.content.id
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.content.content_id
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    private Long contentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.content.user_id
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.content.create_date
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    private Timestamp createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.content.status
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.content.content_status
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    private String contentStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.content.content
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.content.id
     *
     * @return the value of public.content.id
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.content.id
     *
     * @param id the value for public.content.id
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.content.content_id
     *
     * @return the value of public.content.content_id
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public Long getContentId() {
        return contentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.content.content_id
     *
     * @param contentId the value for public.content.content_id
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.content.user_id
     *
     * @return the value of public.content.user_id
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.content.user_id
     *
     * @param userId the value for public.content.user_id
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.content.create_date
     *
     * @return the value of public.content.create_date
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public Timestamp getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.content.create_date
     *
     * @param createDate the value for public.content.create_date
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.content.status
     *
     * @return the value of public.content.status
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.content.status
     *
     * @param status the value for public.content.status
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.content.content_status
     *
     * @return the value of public.content.content_status
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public String getContentStatus() {
        return contentStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.content.content_status
     *
     * @param contentStatus the value for public.content.content_status
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public void setContentStatus(String contentStatus) {
        this.contentStatus = contentStatus == null ? null : contentStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.content.content
     *
     * @return the value of public.content.content
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.content.content
     *
     * @param content the value for public.content.content
     *
     * @mbg.generated Sun May 31 10:20:44 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}