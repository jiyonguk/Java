-- 2020.05.18

select * from emp;

select * from dept;

--�α����� ������ ������ ���̺� Ȯ��

select * from tab;

-- emp : �������
-- dept : �μ�����
-- bouns : �ӽ����̺�
-- salgrade : �޿����̺�

--���̺��� ���� Ȯ�� : desc ���̺��̸�
desc emp;

desc dept;

desc salgrade;

select * from emp;
select * from dept;

-- ������ �˻� ����

select ename, sal, deptno, empno--�÷� �̸�
from emp -- ���̺� �̸�
;

select deptno, dname from dept;



-- select�� ����� ���ο� ���̺��̴�.
-- �÷��� ��� ������ �����ϴ�. +, -, *, /, mod �Լ��̿�

select * from emp;
select ename, sal, sal + comm
from emp
;

select ename, sal, sal+500
from emp
;

select ename, sal, sal-100
from emp
;

select ename, sal, sal*12
from emp
;

select ename, sal, sal/2
from emp
;

select ename, sal, job, comm, sal*12, sal*12+comm
from emp
;

-- null �� ġȯ �Լ� : nvl(�÷���, �⺻��)
-- �⺻���� �÷��� �������� �ڷ����� ���ƾ���
select ename, sal, job, nvl(comm,0), sal*12, sal*12+nvl(comm,0)
from emp
;