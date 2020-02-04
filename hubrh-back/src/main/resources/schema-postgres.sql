-- Table: public.collaborateur

-- DROP TABLE public.collaborateur;

CREATE TABLE public.collaborateur
(
    id integer NOT NULL,
    nom character varying(40) COLLATE pg_catalog."default",
    prenom character varying(40) COLLATE pg_catalog."default",
    mail character varying(100) COLLATE pg_catalog."default",
    date_entree_op date,
    date_sortie_op date,
    cv character varying(100) COLLATE pg_catalog."default",
    is_prestataire boolean,
    fk_id_statut integer,
    commentaire character varying(1000) COLLATE pg_catalog."default",
    isdelete boolean,
    CONSTRAINT collaborateur_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.collaborateur
    OWNER to postgres;