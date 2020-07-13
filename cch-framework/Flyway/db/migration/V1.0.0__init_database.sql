-- 用户表
CREATE TABLE "user"(
  id BIGSERIAL NOT NULL,
  user_id BIGINT NOT NULL,
  user_name VARCHAR(32) NOT NULL,
  user_password VARCHAR(128) NOT NULL,
  status VARCHAR(32) NOT NULL,
  reg_date timestamp with time zone NOT NULL,
  user_role VARCHAR(32) NOT NULL,
  PRIMARY KEY (id)
);

COMMENT ON COLUMN "user".id IS '序号';
COMMENT ON COLUMN "user".user_id IS '用户编号';
COMMENT ON COLUMN "user".user_name IS '用户名';
COMMENT ON COLUMN "user".user_password IS '密码';
COMMENT ON COLUMN "user".status IS '状态';
COMMENT ON COLUMN "user".reg_date IS '注册时间';
COMMENT ON COLUMN "user".user_role IS '用户角色';

CREATE INDEX index_user_user_id ON "user" (user_id);

-- 内容表
CREATE TABLE content(
  id BIGINT,
  content_id BIGINT,
  user_id BIGINT,
  create_date timestamp with time zone NOT NULL,
  status VARCHAR(32),
  content_status VARCHAR(32),
  content TEXT
);

COMMENT ON TABLE content IS '内容列表';
COMMENT ON COLUMN content.id IS '编号';
COMMENT ON COLUMN content.content_id IS '内容编号';
COMMENT ON COLUMN content.user_id IS '作者';
COMMENT ON COLUMN content.create_date IS '创建时间';
COMMENT ON COLUMN content.status IS '发布状态';
COMMENT ON COLUMN content.content_status IS '内容类型';
COMMENT ON COLUMN content.content IS '内容';

CREATE INDEX index_content_content_id ON content (content_id);

-- 评论表
CREATE TABLE comment(
  id BIGINT,
  comment_id BIGINT,
  content_id BIGINT,
  comment TEXT,
  user_id BIGINT,
  comment_date DATE
);

COMMENT ON TABLE comment IS '评论表';
COMMENT ON COLUMN comment.id IS '编号';
COMMENT ON COLUMN comment.comment_id IS '评论编号';
COMMENT ON COLUMN comment.content_id IS '内容编号';
COMMENT ON COLUMN comment.comment IS '评论内容';
COMMENT ON COLUMN comment.user_id IS '评论人';
COMMENT ON COLUMN comment.comment_date IS '评论时间';

CREATE INDEX index_comment_comment_id ON comment (comment_id);