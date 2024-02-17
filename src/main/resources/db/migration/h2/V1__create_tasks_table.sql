create sequence task_id_seq start with 1 increment by 50;
create table tasks (
    id bigint default nextval('task_id_seq') not null,
    title varchar(255) not null,
    column varchar(255) not null,
    created_at timestamp(6) with time zone,
    primary key (id)
);
