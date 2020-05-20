select mod(10,3)
from dual;

select abs(-10)
from dual;

select trunc(1282.44444, 1)
from dual;

select round(1282.44444,-2)
from dual;

select sysdate
from dual;

select sysdate, to_char(sysdate, 'yyyy-mm-dd')
from dual;

select ename, hiredate , to_char(sysdate, 'yyyy-mm-dd') as hiredate
from emp;

select to_char(sysdate, 'yyyy/mm/dd, hh24:mi')
from dual;

select to_char(12500,'000,000')
from dual;

select to_char(12500,'L99,999')
from dual;

select to_char(32.14, '99,9.99')
from dual;

select sal, to_char(sal*1000,'l999,999,999'), to_char(sal*1000*12+nvl(comm, 0), 'L999,999,999') as Income
from emp
order by Income desc;

select to_date('19810220', 'yyyymmdd')
from dual;

select ename, hiredate
from emp
where hiredate = to_date('1981/02/20', 'yyyy/mm/dd');

select sysdate, to_date('20201225','yyyymmdd'),
trunc(to_date('20201215','yyyymmdd')-sysdate)
from dual;

select sysdate, trunc(sysdate-to_date('19940416','yyyymmdd')) as live
from dual;

select to_number('20,000', '999,999,999')-to_number('10,000','999,999')
from dual;

select ename, deptno,
decode(deptno,
            10, 'ACCOUNTING',
            20, 'RESEARCH',
            30, 'SALES',
            40, 'OPERATING') as deptName
from emp;

select ename, sal, job, 
decode(job, 
        'ANALYST', sal+sal*0.05,
        'SALESMAN', sal+sal*0.1,
        'MANAGER', sal+sal*0.15,
        'CLERK', sal+sal*0.2) as UP
from emp;

select ename,deptno,
    case when deptno = 10 then 'ACCOUNTING'
        when deptno = 20 then 'RESEARCH'
        when deptno = 30 then 'SALES'
        when deptno = 40 then 'OPERATING'
    end as dname
from emp;

select sum(sal) as totalSal
from emp;

select to_char(sum(sal), 'L999,999,999') as totalSal
from emp;

select avg(sal)
from emp;

select sum(comm)
from emp;

select count(sal)
from emp
where ename like '%A%E%';

select max(sal), min(sal)
from emp;

select count(*)
from emp;

select count(comm)
from emp;

select deptno, count(distinct job), sum(sal), trunc(avg(sal))
from emp
group by deptno;


select *
from emp
where comm <> 0
order by deptno desc;

select job, count(*)
from emp
group by job;








