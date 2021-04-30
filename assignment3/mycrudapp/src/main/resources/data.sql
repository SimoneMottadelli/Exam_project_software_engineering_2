INSERT INTO municipality (id, name, province_id) VALUES (1, 'Milan', 1);
INSERT INTO municipality (id, name, province_id) VALUES (2, 'Rho', 1);
INSERT INTO municipality (id, name, province_id) VALUES (3, 'Carugate', 1);

INSERT INTO department (id, name, telephone) VALUES (1, 'Department of Computer Science', 01234);

INSERT INTO student (id, name, surname, birth_municipality_id, isee) VALUES (1, 'Mario', 'Rossi', 1, 30000);
INSERT INTO student (id, name, surname, birth_municipality_id, isee) VALUES (2, 'Francesco', 'Neri', 2, 20000);
INSERT INTO student (id, name, surname, birth_municipality_id, isee) VALUES (3, 'Michele', 'Bianchi', 1, 25000);

INSERT INTO professor (id, name, surname, birth_municipality_id, salary, department_id) VALUES (4, 'Giovanni', 'Verdi', 1, 40000, 1);
INSERT INTO professor (id, name, surname, birth_municipality_id, salary, department_id) VALUES (5, 'Maria', 'Azzurri', 3, 45000, 1);

INSERT INTO course (id, name) VALUES (1, 'Machine learning');
INSERT INTO course (id, name) VALUES (2, 'Algorithm and data structures');
INSERT INTO course (id, name) VALUES (3, 'Software process and development');

INSERT INTO exam (student_id, course_id, evaluation) VALUES (1, 1, 28);
INSERT INTO exam (student_id, course_id, evaluation) VALUES (1, 2, 28);
INSERT INTO exam (student_id, course_id, evaluation) VALUES (3, 1, 29);