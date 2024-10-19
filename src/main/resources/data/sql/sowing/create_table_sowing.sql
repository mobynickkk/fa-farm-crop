create table sowing(
    id uuid primary key default gen_random_uuid(),
    crop_id uuid not null references crop (id),
    field_id uuid not null references field (id),
    sowing_date timestampz not null,
    amount integer not null,
    unit varchar(15) not null default 'UNIT'
);