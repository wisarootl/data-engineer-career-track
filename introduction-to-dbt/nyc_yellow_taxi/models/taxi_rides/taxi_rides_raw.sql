-- Modify the following line to change the materialization type
-- {{ config(materialized='view') }}
{{ config(materialized = 'table') }} 

WITH source_data AS (
  -- Add the query as described to generate the data model
  SELECT
    *
  FROM
    read_parquet('yellow_tripdata_2023-01.parquet')
)
SELECT
  *
FROM
  source_data
WHERE
  payment_type != 0
  