CREATE TABLE user (
    userID VARCHAR(10) NOT NULL,
    fullName VARCHAR(30) NOT NULL,
		username VARCHAR(15) NOT NULL,
		password VARCHAR(15) NOT NULL,
		dateCreated DATETIME NOT NULL,
		PRIMARY KEY (id)
);

CREATE TABLE post (
    postID VARCHAR(10) NOT NULL,
    userID VARCHAR(10) NOT NULL,
		text VARCHAR(500),
		mediaID VARCHAR(10),
		dateCreated DATETIME NOT NULL,
		PRIMARY KEY (id)
);

CREATE TABLE media (
    mediaID VARCHAR(10) NOT NULL,
    mediaPath VARCHAR(100) NOT NULL,
		PRIMARY KEY (id)
);

CREATE TABLE like (
    postID VARCHAR(10) NOT NULL,
		userID VARCHAR(10) NOT NULL,
		PRIMARY KEY (id)
);

CREATE TABLE shared (
    taggedPostID VARCHAR(10) NOT NULL,
		postID VARCHAR(10) NOT NULL,
		PRIMARY KEY (id)
);



INSERT INTO user VALUES (userID, fullName, username, password, dateCreated);

INSERT INTO post VALUES (postID, userID, text, mediaID, dateCreated);