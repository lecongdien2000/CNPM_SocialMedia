CREATE DATABASE database_social;
CREATE TABLE User (
    userID VARCHAR(10) NOT NULL,
    fullName VARCHAR(30) NOT NULL,
		username VARCHAR(15) NOT NULL,
		password VARCHAR(15) NOT NULL,
		dateCreated DATETIME NOT NULL,
		PRIMARY KEY (userID)
);

CREATE TABLE Media (
    mediaID VARCHAR(10) NOT NULL,
    mediaPath VARCHAR(100) NOT NULL,
		PRIMARY KEY (mediaID,mediaPath)
);

CREATE TABLE Post (
    postID VARCHAR(10) NOT NULL,
    userID VARCHAR(10) NOT NULL,
		text VARCHAR(500),
		mediaID VARCHAR(10) NOT NULL,
		dateCreated DATETIME NOT NULL,
		PRIMARY KEY (postID),
		FOREIGN KEY (userID) REFERENCES User(userID),
		FOREIGN KEY (mediaID) REFERENCES Media(mediaID)
);



CREATE TABLE Liked (
    postID VARCHAR(10) NOT NULL,
		userID VARCHAR(10) NOT NULL,
		PRIMARY KEY (postID,userID),
		FOREIGN KEY (postID) REFERENCES Post(postID),
		FOREIGN KEY (userID) REFERENCES User(userID)
);

CREATE TABLE Shared (
    taggedPostID VARCHAR(10) NOT NULL,
		postID VARCHAR(10) NOT NULL,
		PRIMARY KEY (taggedPostID,postID),
		FOREIGN KEY (postID) REFERENCES Post(postID)
);

CREATE TABLE Comment (
    commentID VARCHAR(10) NOT NULL,
		userID VARCHAR(10) NOT NULL,
		postID VARCHAR(10) NOT NULL,
		text VARCHAR(500) NOT NULL,
		dateCreated DATETIME,
		PRIMARY KEY (commentID),
		FOREIGN KEY (userID) REFERENCES User(userID),
		FOREIGN KEY (postID) REFERENCES Post(postID)
);



INSERT INTO user VALUES ("abc", "Nguyễn Văn Nam", "abc", "123456", "2020-03-28");