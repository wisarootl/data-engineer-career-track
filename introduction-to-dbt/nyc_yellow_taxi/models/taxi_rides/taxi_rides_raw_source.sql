
-- dbt source
{# {{ config(materialized='view')}}

select * from {{ source('raw', 'taxi_rides') }} #}