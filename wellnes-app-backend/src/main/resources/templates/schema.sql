CREATE TABLE POST(
POST_ID BIGSERIAL PRIMARY KEY;
POST_HEADING VARCHAR(64) NOT NULL;
POST_DESC VARCHAR NOT NULL;
POST_DATE DATE ;
UPDATED_DATE DATE;
POST_AUTHOR VARCHAR(64) NOT NULL;
);

CREATE TABLE COMMENTS(
COMMENT_ID BIGSERIAL PRIMARY KEY;
POST_ID LONG FOREIGN KEY NOT NULL;
COMMENT_DESC VARCHAR(264) NOT NULL;
COMMENT_DATE DATE ;
COMMENTER_NAME VARCHAR(64);
);