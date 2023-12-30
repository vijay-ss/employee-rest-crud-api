FROM mysql:latest

ENV MYSQL_ROOT_PASSWORD=root

COPY db_dump/employee-directory.sql employee-directory.sql