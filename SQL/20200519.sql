--2020.05.19

-- 특정 데이터를 추출하기 : where 절을 이용
-- select 컬럼명 from 테이블 이름 where 조건(true/false)
select ename, sal
from emp
where sal >= 3000;

-- 전체 사원중 10번부서에 소속된 사원의 이름과 직급을 출력
select ename, job
from emp
where deptno = 10;

-- 이름이 FORD인 사원의 사원번호와 이름 급여를 출력
-- 데이터값은 대소문자구분
-- 문자열표현 : 작은따옴표로 묶음
select ename,empno,sal
from emp
where ename = 'FORD';

select *
from emp
where hiredate = '80-12-17'; -- 날짜비교 -> ''이용

--and
--a 이고 b
select*
from emp
where deptno = 10 and job = 'MANAGER';

--or
--a 이거나 b
select*
from emp
where deptno = 10 or job = 'MANAGER';

--not, <>
--아님
select*
from emp
where not deptno = 10;
--where deptno != 10;
--where deptno <> 10;

--컬럼명 between a and b
select*
from emp
where sal between 2000 and 3000;

select*
from emp
--where hiredate > '1987-01-01'; -- 1987년 이후
--where hiredate >= '1987-01-01' and hiredate <= '1987-12-31';
where hiredate between '1981-01-01' and '1981-12-31';

--or 연산간소화
-- 컬럼이름 in(data,data,data,....)
select*
from emp
--where comm = 300 or comm = 1400 or comm = 0 or comm = 500;
where comm in(300,1400,0,500);

--패턴검색 like
-- 컬럼이름 like 패턴
-- 패턴 :%,_
-- % -> 0개이상 문자열 가능
-- _ -> 1개의 자리수에 어떠한 문자가와도 가능
select*
from emp
--where ename like 'S'; -- ename = 'S'
--where ename like 'S%'; 
--where ename like '%IN';
where ename like '%AR%';

select*
from emp
--where ename like '%L_';
where ename not like '%A%';

select*
from emp
where comm is not null;

--row의 정렬
-- 오름차순 asc(생략가능, 기본값) 작은쪽-> 큰쪽
-- 내림차순 desc(생략불가) 작은쪽 -> 큰쪽
select ename, sal, hiredate, comm
from emp
--where empno>0
--order by ename asc-- 문자의 오름차순
--order by ename -- 문자의 오름차순 asc 생략
--order by ename desc-- 문자의 내림차순
--order by sal asc-- 숫자의 오름차순
--order by sal desc -- 숫자의 내림차순
--order by hiredate -- 날짜의 오름차순
--order by hiredate desc -- 날짜의 내림차순
--order by comm asc --null의 오름차순
order by comm desc --null의 내림차순
;

select ename, sal
from emp
order by sal desc, ename
;

