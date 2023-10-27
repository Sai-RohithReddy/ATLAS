use hr;

select * from employees;

-- Q1 
select first_name, last_name
from employees 
where salary > (
select salary from employees 
where employee_id = 163
);

-- Q2
 select first_name, last_name, department_id, job_id
 from employees
 where department_id in (
 select department_id from employees 
 where employee_id = 169
 );
 
 -- Q3
 select first_name, last_name, department_id
 from employees
 where salary in (
 select min(salary) as salary from employees
 group by department_id
 );
 
 -- Q4
 select employee_id, first_name, last_name
 from employees
 where salary > (
 select avg(salary) from employees
 );

-- Q5
select first_name, last_name, employee_id, salary
from employees
where manager_id = (
select employee_id from employees
where first_name = "Payam"
);

-- Q6
select department_id, first_name, job_id
from employees 
where employee_id in (
select employees.employee_id from employees 
left join departments on employees.department_id = departments.department_id
where department_name = "Finance"
);

select e.department_id, e.first_name, e.job_id, d.department_name
from employees e, departments d
where e.department_id = d.department_id and
d.department_name = "Finance";

-- Q7
 select * from employees
 where salary = 3000 and manager_id = 121;
 
 -- Q8
 select * from employees 
 where employee_id in (134, 159, 183);
 
 -- Q9
 select * from employees
 where salary between 1000 and 3000;
 
 -- Q10
 select * from employees
 where salary >= (
 select min(salary) from employees) 
 and salary <= 2500;
 
 select * from employees
 where salary between
 (select min(salary)
 from employees)
 and 2500;
 
 -- Q11
 select * from employees
 where department_id in (
 select department_id 
 from departments
 where manager_id not between 100 and 200);
 
 -- Q12
 select * from employees
 where salary = (
 select max(salary) from employees 
 where salary < (
 select max(salary) from employees));
 
 -- Q28
 select last_name from employees
 where department_id in 
 (select department_id from departments where department_name = "IT")
 and salary > 
 (select avg(salary) from employees);
 