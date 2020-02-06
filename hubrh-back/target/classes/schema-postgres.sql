-- Table: public.collaborateur

-- DROP TABLE public.collaborateur;

CREATE TABLE public.collaborateur
(
    id integer NOT NULL,
    name character varying(40) COLLATE pg_catalog."default",
    first_name character varying(40) COLLATE pg_catalog."default",
    email character varying(100) COLLATE pg_catalog."default",
    cv character varying(100) COLLATE pg_catalog."default",
    comment character varying(1000) COLLATE pg_catalog."default",
    is_provider boolean,
    arrival_date_pp date,
    left_date_op date,
    fk_id_status Integer,
    deleted boolean,
    CONSTRAINT collaborateur_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.collaborateur
    OWNER to postgres;