CREATE SCHEMA IF NOT EXISTS rental_service;

CREATE TABLE rental_service.car (
    id SERIAL PRIMARY KEY,
    license_plate VARCHAR(10) NOT NULL UNIQUE,
    model VARCHAR(50) NOT NULL,
    daily_rate NUMERIC(10, 2) NOT NULL
);

INSERT INTO rental_service.car (license_plate, model, daily_rate) VALUES
            ('AA-123-BB', 'Renault', 45.0),
            ('CC-456-DD', 'Peugeot', 50.0),
            ('EE-789-FF', 'Citroën', 42.0),
            ('GG-012-HH', 'BMW', 85.0),
            ('II-345-JJ', 'Mercedes', 95.0);

CREATE SCHEMA IF NOT EXISTS customer_service;

CREATE TABLE customer_service.customers (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE,
    address VARCHAR(255) NOT NULL
);

INSERT INTO customer_service.customers (name, address) VALUES
    ('Jean Dupont', '12 Rue de la Paix, Paris'),
    ('Marie Martin', '34 Avenue des Champs, Lyon'),
    ('Pierre Bernard', '56 Boulevard Victor Hugo, Marseille'),
    ('Sophie Dubois', '78 Rue du Commerce, Toulouse'),
    ('Luc Petit', '90 Place de la République, Nice');