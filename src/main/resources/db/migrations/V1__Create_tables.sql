CREATE TABLE tb_missoes (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(255),
dificuldade CHAR(1)
);

CREATE TABLE tb_cadastro_ninja (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(255),
email VARCHAR(255) UNIQUE,
img_url VARCHAR(255),
idade INT NOT NULL,
missoes_id BIGINT,
CONSTRAINT fk_missoes FOREIGN KEY (missoes_id) REFERENCES tb_missoes(id)
);