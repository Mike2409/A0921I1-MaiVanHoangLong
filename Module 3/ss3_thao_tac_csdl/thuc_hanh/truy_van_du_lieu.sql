use quan_ly_sinh_vien;
SELECT * FROM Student WHERE Status = true;
SELECT * FROM `subject` WHERE Credit < 10;
SELECT S.student_id, S.student_name, C.class_name FROM Student S join Class C on S.class_id = C.class_id WHERE C.class_name = 'A1';
