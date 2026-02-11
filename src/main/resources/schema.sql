CREATE TABLE IF NOT EXISTS student (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    email VARCHAR(50)
);

-- Thêm thử một sinh viên để lát nữa có cái mà xem
INSERT INTO student (name, email) VALUES ('Nguyen V an A', 'nguyenvana@example.com');