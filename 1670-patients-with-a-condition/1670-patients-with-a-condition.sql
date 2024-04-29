# Write your MySQL query statement below
# 제1형 당뇨병 환자의 patient_id, patient_name 및 상태를 구하는 솔루션을 작성합니다. 
# 제1형 당뇨병은 항상 DIAB1 접두사로 시작합니다

select *
from Patients
where conditions like 'DIAB1%' or 
      conditions like '% DIAB1%';