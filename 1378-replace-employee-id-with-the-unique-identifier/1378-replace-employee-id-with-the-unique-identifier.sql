/* Write your PL/SQL query statement below */
select euid.unique_id ,eid.name
from employees eid  full outer join employeeuni  euid
on  euid.id=eid.id;