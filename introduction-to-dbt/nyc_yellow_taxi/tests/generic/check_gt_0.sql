{% test check_gt_0(model, column_name) %}
select * 
from {{ model }}
where {{ column_name }} <= 0
{% endtest %}
