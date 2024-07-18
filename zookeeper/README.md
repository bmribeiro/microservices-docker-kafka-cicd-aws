# Kafka e Zookeeper com Docker Compose

Configuração do Docker Compose para iniciar instâncias do Zookeeper e do Kafka usando contêineres Docker.

## Estrutura do `docker-compose.yml`

Este arquivo `docker-compose.yml` define dois serviços: `zookeeper` e `kafka`.

### Serviços

- **Zookeeper**: Serviço de coordenação necessário para o Kafka.
  - Utiliza a imagem Docker `confluentinc/cp-zookeeper:latest`.
  - Escuta na porta 2181.
  
  
- **Kafka**: Broker de mensagens que depende do Zookeeper.
  - Utiliza a imagem Docker `confluentinc/cp-kafka:latest`.
  - Escuta na porta 9092.

### Configurações

- **Zookeeper**
  - `ZOOKEEPER_CLIENT_PORT: 2181`: Porta do cliente Zookeeper.
  - `ZOOKEEPER_TICK_TIME: 2000`: Tempo de tick (em milissegundos).
  
  
- **Kafka**
  - `KAFKA_BROKER_ID: 1`: ID do broker Kafka.
  - `KAFKA_ZOOKEEPER_CONNECT: zookeeper:2181`: Endereço do Zookeeper.
  - `KAFKA_ADVERTISED_LISTENERS: PLAINTEXT://localhost:9092`: Endereço anunciado para os clientes.
  - `KAFKA_OFFSETS_TOPIC_REPLICATION_FACTOR: 1`: Fator de replicação para o tópico de offsets.

### Como Executar

Para executar esses serviços, siga os passos abaixo:

1. Certifique-se de ter o [Docker](https://www.docker.com/get-started) e o [Docker Compose](https://docs.docker.com/compose/install/) instalados no seu sistema.

Para Iniciar Serviços

	docker-compose up
	
Para Parar Serviços

	docker-compose down
	


