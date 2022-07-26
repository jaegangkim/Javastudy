

CREATE TABLE course (
    coursr_id              NUMBER(3) NOT NULL,
    course_name            VARCHAR2(100) NOT NULL,
    start_date             DATE NOT NULL,
    end_date               DATE NOT NULL,
    professor_professor_id NUMBER(3) NOT NULL
);

ALTER TABLE course ADD CONSTRAINT course_pk PRIMARY KEY ( coursr_id );

CREATE TABLE department (
    dapartment_id   NUMBER(10) NOT NULL,
    dapertment_name VARCHAR2(100) NOT NULL
);

ALTER TABLE department ADD CONSTRAINT department_pk PRIMARY KEY ( dapartment_id );

CREATE TABLE professor (
    professor_id             NUMBER(3) NOT NULL,
    professor_name           VARCHAR2(100) NOT NULL,
    department_dapartment_id NUMBER(10) NOT NULL
);

ALTER TABLE professor ADD CONSTRAINT professor_pk PRIMARY KEY ( professor_id );

CREATE TABLE student (
    student_id               NUMBER(10) NOT NULL,
    student_name             VARCHAR2(100) NOT NULL,
    height                   NUMBER(3),
    department_dapartment_id NUMBER(10) NOT NULL
);

ALTER TABLE student ADD CONSTRAINT student_pk PRIMARY KEY ( student_id );

CREATE TABLE student_course (
    course_coursr_id   NUMBER(3) NOT NULL,
    student_student_id NUMBER(10) NOT NULL
);

ALTER TABLE course
    ADD CONSTRAINT course_professor_fk FOREIGN KEY ( professor_professor_id )
        REFERENCES professor ( professor_id );

ALTER TABLE professor
    ADD CONSTRAINT professor_department_fk FOREIGN KEY ( department_dapartment_id )
        REFERENCES department ( dapartment_id );

ALTER TABLE student_course
    ADD CONSTRAINT student_course_course_fk FOREIGN KEY ( course_coursr_id )
        REFERENCES course ( coursr_id );

ALTER TABLE student_course
    ADD CONSTRAINT student_course_student_fk FOREIGN KEY ( student_student_id )
        REFERENCES student ( student_id );

ALTER TABLE student
    ADD CONSTRAINT student_department_fk FOREIGN KEY ( department_dapartment_id )
        REFERENCES department ( dapartment_id );


