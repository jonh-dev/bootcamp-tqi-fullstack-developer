CREATE TABLE pessoas(
  id INT NOT NULL PRIMARY KEY AUTOINCREMENT,
  nome VARCHAR(30) NOT NULL,
  nascimento DATE
)

INSERT INTO pessoas (nome, nascimento) VALUES ('João Carlos', '1991-05-26')
INSERT INTO pessoas (nome, nascimento) VALUES ('Sael Freire', '2021-04-21')
INSERT INTO pessoas (nome, nascimento) VALUES ('Mayara Freire', '1990-12-06')