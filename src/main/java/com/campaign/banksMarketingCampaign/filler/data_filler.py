import csv
from pycassa.pool import ConnectionPool
import sys
from pycassa.columnfamily import ColumnFamily

pool = ConnectionPool('mykeyspace', ['localhost:9042'])
cf = ColumnFamily(pool, "NBD")

with open('bank-full.csv', 'rb') as csvfile:
  reader = csv.DictReader(csvfile)
  for row in reader:
    print(str(row))
    key = row['id']
    del row['id']
    cf.insert(key, row)
pool.dispose()