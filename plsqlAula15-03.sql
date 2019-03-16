
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