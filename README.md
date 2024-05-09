CREADO POR VALENTINA VELASTEGUI Y ALEJANDRO RODRÍGUEZ
se necesita tener creada la base de datos "db_refugio"

url para el postman: OPCION "POST" ---> http://localhost:8080/refugio
                    y se pone ahi donde se escribe:
                    {
                      "id_dueno": nn,
                      "id_ciudad": nn,
                      "direccion": "nnn",
                      "pop_maxima": nn,
                      "pop_actual": nn,
                      "nombre_refugio": "nnn"
                    }
                     

para actualizar datos:
                            "PUT" ---> http://localhost:8080/refugio/ID_DEL_REFUGIO_A_ACTUALIZAR
                                                {
                      "id_dueno": nn,
                      "id_ciudad": nn,
                      "direccion": "nnn",
                      "pop_maxima": nn,
                      "pop_actual": nn,
                      "nombre_refugio": "nnn"
                    }

para buscar datos: 
                         "GET"----> http://localhost:8080/refugio/ID_DEL_REFUGIO_De_CONSULTA      y no pones nada mas.

                        
