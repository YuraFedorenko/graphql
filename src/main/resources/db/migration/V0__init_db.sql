CREATE SEQUENCE public.users_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

create table users (
    id bigint primary key,
    name varchar not null,
    status varchar not null
);

create table roles (
    id bigint primary key,
    name varchar not null,
    description varchar not null
);

create table user_role (
    user_id bigint not null references users(id),
    role_id bigint not null references roles(id)
);