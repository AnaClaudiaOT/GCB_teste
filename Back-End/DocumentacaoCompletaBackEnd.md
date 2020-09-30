# Documentação Back-End

## Doctor

 ### Model

| Atributo | Tipo   |
|----------|--------|
| id       | long   |
| nome     | String |
| crm      | String |
| telefone | String |


### CRUD
 
| Métodos| End-points                           | Descrição                           |
|--------|--------------------------------------|-------------------------------------|
| Get    | FindAll -> /doctor                   | Listar todos os Médicos existentes
| Get    | FindAllByNome -> /doctor/nome/{nome} | Listar Médico por nome
| Post   | FindAll -> /doctor                   | Inserir os dados
| Put    | FindAll -> /doctor                   | Editar algum dado específico
| Delete | FindAll -> /doctor/{id}              | Excluir algum dado pelo ID

A tabela possuirá os end-points básicos (get, post, put e delete) e mais um método específico, que busca pelo nome.

### Json

```json
{
    "nome":"Fabio Santos",
    "crm": "4566",
    "telefone": "(11)3698-7896"

}

PUT CIDADE / ESTADO / ESPECIALIDADE -> DOCTOR
/doctor

{
        "id": 1,
        "nome": "Fabio Santos",
        "crm": "4566",
        "telefone": "(11)3698-7896",
        "cidade": {"id":1},
        "estado": {"id":1},
        "especialidade": {"id":1}
    }


```

## Cidade

 ### Model

| Atributo | Tipo   |
|----------|--------|
| id       | long   |
| cidade   | String | 


### CRUD
 
| Métodos| End-points                                  | Descrição                           |
|--------|---------------------------------------------|-------------------------------------|
| Get    | FindAllByCidade -> / cidade/cidade/{cidade} | Listar todas as cidades 
| Post   | FindAll -> /cidade                          | Inserir os dados
| Put    | FindAll -> /cidade                          | Editar algum dado específico
| Delete | FindAll -> /cidade/{id}                     | Excluir algum dado pelo ID



### Json

```json
{
    "cidade": "São Paulo"
}

```

## Estado

 ### Model

| Atributo | Tipo   |
|----------|--------|
| id       | long   |
| estado   | String | 



### CRUD
 
| Métodos| End-points                                  | Descrição                           |
|--------|---------------------------------------------|-------------------------------------|
| Get    | FindAllByEstado -> / estado/estado/{estado} | Listar todos os estados
| Post   | FindAll -> /estado                          | Inserir os dados
| Put    | FindAll -> /estado                          | Editar algum dado específico
| Delete | FindAll -> /estado/{id}                     | Excluir algum dado pelo ID

### Json

```json
{
    "estado": "São Paulo"
}

```

## Especialidades

 ### Model

| Atributo      | Tipo | Qtd. Caracteres |
|---------------|------|-----------------|
| id            |  long 
| especialidade | String | 



### CRUD
 
| Métodos| End-points                                  | Descrição                           |
|--------|---------------------------------------------|-------------------------------------|
| Get    | FindAllByEspecialidade -> / especialidades/espec/{especialidade}| Listar todos os estados
| Post   | FindAll -> /especialidades                                      | Inserir os dados
| Put    | FindAll -> /especialidades                                      | Editar algum dado específico
| Delete | FindAll -> /especialidades/{id}                                 | Excluir algum dado pelo ID


### Json

```json
{    
    "especialidade": "ALERGOLOGIA"  
}


```


