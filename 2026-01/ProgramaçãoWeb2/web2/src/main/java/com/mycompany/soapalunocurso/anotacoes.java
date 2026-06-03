/*
    Projeto SOAP - Aluno e Curso

1. Objetivo
Criar um sistema utilizando Web Services SOAP para gerenciar alunos e cursos, incluindo
operações CRUD e relacionamento entre as entidades.

2. Classe Aluno
Representa um aluno com atributos id, nome e uma lista de cursos. Possui validações e suporte à
serialização para SOAP.

3. Classe Curso
Representa um curso com id e nome, incluindo validações básicas.

4. Serviços SOAP
Foram criados dois serviços: AlunoServer e CursoServer, cada um com operações de criar,
buscar, atualizar e deletar.

5. Implementação
As classes AlunoServerImpl e CursoServerImpl implementam os serviços e utilizam estruturas em
memória (Map) para armazenar os dados.

6. Relacionamento
Um aluno pode possuir vários cursos. Esse relacionamento foi implementado através de uma lista
dentro da classe Aluno.

7. Publicação dos Serviços
Os serviços foram publicados utilizando Endpoint.publish(), em portas diferentes (8080 e 8082).

8. Cliente SOAP
Foi criado um cliente em Java para consumir os serviços, testar operações e validar o
funcionamento completo do sistema.

9. Logs
O sistema utiliza logs para registrar as operações realizadas, facilitando testes e depuração.

10. Conclusão
O sistema funciona corretamente, permitindo gerenciar alunos e cursos via SOAP, incluindo o
relacionamento entre eles.
*/