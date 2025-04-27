CREATE TABLE employees (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    salary DECIMAL(10, 2),
    profession VARCHAR(50)
);


DROP TABLE IF EXISTS employees;

INSERT INTO employees (name, salary, profession)
VALUES ('John', 10000.00, 'Developer');


UPDATE employees
SET salary = 55000.00
WHERE name = 'John';


SELECT name, salary FROM employees;


DELETE FROM employees;