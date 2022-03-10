CREATE TABLE IF NOT EXISTS STUDENT
(
    student_id int(10) DEFAULT NULL,
    first_name VARCHAR(25) DEFAULT NULL,
    last_name VARCHAR(25) DEFAULT NULL,
    major VARCHAR(25) DEFAULT NULL,
    age int(2) DEFAULT NULL,
    PRIMARY KEY (student_id)
)
AS
SELECT *
FROM CSVREAD('C:\Users\Abdul\OneDrive\Documenten\Java\StudentApp\studentapp\src\main\resources\student.csv');



CREATE TABLE IF NOT EXISTS COURSE
(
    course_id int(10) DEFAULT NULL,
    course_name VARCHAR(25) DEFAULT NULL,
    lenght int (2) DEFAULT NULL,
    major VARCHAR(25) DEFAULT NULL,
    PRIMARY KEY (course_id),
   
)
AS
SELECT *
FROM CSVREAD('classpath:course.csv');


CREATE TABLE IF NOT EXISTS ENROLLMENT
(
    student_id int(10) DEFAULT NULL,
    course_id int(10) DEFAULT NULL,
    enrollment_id int(10) DEFAULT NULL,
    teacher_firstname VARCHAR(25) DEFAULT NULL,
    teacher_lastname VARCHAR(25) DEFAULT NULL,
    PRIMARY KEY (class_id),
    FOREIGN KEY (course_id) REFERENCES COURSE (course_id)
    FOREIGN KEY (student_id) REFERENCES STUDENT (student_id)

)
AS
SELECT *
FROM CSVREAD('classpath:/enrollment.csv');