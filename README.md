## Nome: Sistema_estudantes
* Descrição: Um sistema que controla estudantes e seus cursos

* End Points
    * Sistema
        * GET /api/sistema/info
    * Estudante
        * GET /api/estudantes/{matricula}
    * Curso
        * GET /api/cursos
        * GET /api/cursos/{id}
        * POST /api/cursos

* Como rodar
    * ./mvnw spring-boot:run

* Como usar

* Sistema
    * GET /api/sistema/info -> Só dar um get.
* Estudante
    * GET /api/estudantes/{matricula} -> Só dar um get, ele filtra pela matricula que voce colocar ali (100-104)
* Curso
    * GET /api/cursos -> Só dar um get.
    * GET /api/cursos/{id} -> Só dar um get, ele filtra pelo id que voce colocar ali.
    * POST /api/cursos -> Post passando o nome do curso no body da requisição. Exemplo proxima linha.
* curl -X POST http://localhost:8080/api/cursos \
-H "Content-Type: application/json" \
-d '{"nome": "Nome que voce quiser que seja o nome do curso vai aqui"}'

* Eduardo Müller - Não sei a matricula