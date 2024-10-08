CREATE TABLE IF NOT EXISTS words
(
    id          bigint generated by default as identity
        constraint words_pkey primary key,
    word        text unique not null,
    is_filtered boolean     not null default false
);

CREATE TABLE IF NOT EXISTS urls
(
    id  bigint generated by default as identity
        constraint urls_pkey primary key,
    url text unique not null
);

CREATE TABLE IF NOT EXISTS word_locations
(
    id       bigint generated by default as identity
        constraint word_locations_pkey primary key,
    word_id  bigint references words (id),
    url_id   bigint references urls (id),
    location bigint not null
);

CREATE TABLE IF NOT EXISTS links_between_urls
(
    id          bigint generated by default as identity
        constraint links_between_urls_pkey primary key,
    from_url_id bigint references urls (id),
    to_url_id   bigint references urls (id)
);

CREATE TABLE IF NOT EXISTS links_words
(
    id      bigint generated by default as identity
        constraint links_words_pkey primary key,
    word_id bigint references words (id),
    link_id bigint references links_between_urls (id)
);