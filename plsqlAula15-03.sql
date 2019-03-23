
 /*uso de operacao com alias */
select 
first_name NOME, last_name SOBRENOME, salary SALÁRIO, salary*(1+ commission_pct) "SALÁRIO COM COMISSÃO",  (salary*(1+ commission_pct))*12 "SALÁRIO ANUAL COM COMISSÃO"
from employees;

 /*uso de concatenação*/
select 
first_name|| ' ' || last_name "Nome Completo"
from employees;



  
/* usando asterisco no texto literal*/  
select 
  q'[caixa d'agua]'
  
  from dual;
  
select 
   'O empregado '|| first_name|| ' ' || last_name
                 || 'tem salario igual a '
                 || salary 
                 || '.'
from employees;

/* select de todos os salarios com comissao*/
select 
  'O empregado ''''
                 '|| first_name|| ' ' || last_name
                 || ' tem salario igual a '
                 || salary
                
                 || ' salario anual igual a '
                 || (salary *12)
                 
                 || ' salario com comissao igual a '
                 || salary*(1+commission_pct) 
                
                 || ' salario anual com comissao igual a '
                 || (salary*(1+commission_pct))*12
                 
                 
  from employees
  
  where commission_pct >0;
                                                                                                                   
                                                                                                                   select FIRST_NAME || ' ' || LAST_NAME "Nome completo"
from employees
where hire_date between '01/01/2006' and '31/12/2006';

----------------------------------------------------------------------

select * --FIRST_NAME || ' ' || LAST_NAME "Nome completo"
from employees
where commission_pct not in (0.1, 0.3, 0.2, 0.25);

-----------------------------------------------------------------------

select FIRST_NAME
from employees
where first_name like '%a%'; /*busca qualquer padrao a no campo fist_name*/

------------------------------------------------------------------------
select FIRST_NAME
from employees
where first_name like '_a_'; /*busca qualquer padrao a no campo fist_name*/

--------------------------------------------------------------------------
select FIRST_NAME || ' ' || LAST_NAME 
from employees
order by first_name

--------------------------------------------------------------

select FIRST_NAME || ' ' || LAST_NAME as nome
from employees
order by nome
