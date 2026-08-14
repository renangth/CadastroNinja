-- Migrations para adicionar a coluna de RANK na tabela de cadastros

ALTER TABLE tb_cadastro_ninja
ADD COLUMN "rank" VARCHAR(255)