use ckpO7pCTY8;
CREATE TABLE user (
    userID VARCHAR(10) NOT NULL,
    fullName VARCHAR(30) NOT NULL,
		username VARCHAR(15) NOT NULL,
		password VARCHAR(15) NOT NULL,
		dateCreated DATETIME NOT NULL,
		PRIMARY KEY (userID)
);

CREATE TABLE post (
    postID VARCHAR(10) NOT NULL,
    userID VARCHAR(10) NOT NULL,
		text VARCHAR(500),
		dateCreated DATETIME NOT NULL,
		PRIMARY KEY (postID),
		FOREIGN KEY (userID) REFERENCES user(userID)
);

CREATE TABLE media (
    postID VARCHAR(10) NOT NULL,
    mediaPath VARCHAR(100) NOT NULL,
		PRIMARY KEY (postID ,mediaPath),
		FOREIGN KEY (postID) REFERENCES post(postID)
);


CREATE TABLE liked (
    postID VARCHAR(10) NOT NULL,
		userID VARCHAR(10) NOT NULL,
		PRIMARY KEY (postID,userID),
		FOREIGN KEY (postID) REFERENCES post(postID),
		FOREIGN KEY (userID) REFERENCES user(userID)
);

CREATE TABLE shared (
    taggedPostID VARCHAR(10) NOT NULL,
		postID VARCHAR(10) NOT NULL,
		PRIMARY KEY (taggedPostID,postID),
		FOREIGN KEY (postID) REFERENCES post(postID)
);

CREATE TABLE comment (
    commentID VARCHAR(10) NOT NULL,
		userID VARCHAR(10) NOT NULL,
		postID VARCHAR(10) NOT NULL,
		text VARCHAR(500) NOT NULL,
		dateCreated DATETIME,
		PRIMARY KEY (commentID),
		FOREIGN KEY (userID) REFERENCES user(userID),
		FOREIGN KEY (postID) REFERENCES post(postID)
);

CREATE TABLE data ( `path` VARCHAR(500) NOT NULL , `data` LONGBLOB NOT NULL ) ENGINE = InnoDB;

INSERT INTO user VALUES ("0", "Nguyễn Văn Nam", "abc", "123456", "2020-03-28");