# Atividade Avaliativa C3A1 - Análise de Dados de Preços de Casas nos Estados Unidos

Este projeto de análise de dados tem como objetivo explorar um conjunto de dados de preços de casas nos Estados Unidos
e criar um modelo de regressão para prever o preço de venda de uma casa.
O desafio proposto envolve várias etapas do processo de análise de dados e construção de modelos de aprendizagem de máquina.

## Contexto e Objetivo
O contexto do projeto é a análise de dados de preços de casas nos Estados Unidos. 
O objetivo é desenvolver habilidades em análise exploratória de dados, feature engineering, construção e avaliação
de modelos de aprendizagem supervisionada e não supervisionada, utilizando um dataset real.

## Dados
O conjunto de dados utilizado é composto por informações sobre preços de casas em diferentes bairros dos Estados Unidos,
juntamente com características das casas, como número de quartos, banheiros, tamanho do terreno, entre outras.
Para acessar o conjunto de dados de preços de casas nos Estados Unidos [clique aqui](https://www.kaggle.com/c/house-prices-advanced-regression-techniques/data).

## Tarefas
O projeto apresenta as seguintes tarefas:
- Análise Exploratória de Dados:

Realizar uma análise exploratória dos dados para entender a distribuição das variáveis e identificar possíveis correlações entre elas.

- Feature Engineering:

Realizar transformações nas variáveis do dataset.
Realizar a engenharia de características para selecionar as variáveis mais importantes para o modelo de regressão.

- Aprendizagem Supervisionada:

Regressão Linear: Criação de um modelo de regressão linear múltipla para prever o preço de venda de uma casa.

Classificação: Converter a variável de saída em uma variável binária e criar um modelo de classificação para prever se uma casa será vendida por um preço alto ou baixo. 
Utilização da regressão logística, considerando a média como ponto de separação para classificar preços como baratos ou caros.

- Aprendizagem Não Supervisionada:

Clusterização: Utilizar um algoritmo de clusterização para identificar grupos de casas com características semelhantes. Utilização do algoritmo K-means.

Redução de dimensionalidade: Utilizar uma técnica de redução de dimensionalidade para visualizar os dados em um espaço de menor dimensão.
Utilização da Análise de Componentes Principais (Principal Component Analysis - PCA).

Análise de associação: Utilizar o algoritmo Apriori para identificar associações entre as características das casas.

Análise de outliers: Utilizar o algoritmo Local Outlier Factor para identificar casas que podem ser consideradas outliers.

- Métricas de Avaliação e Comparação:

Utilizar diferentes métricas para avaliar o desempenho dos modelos criados e compará-los.
No caso da regressão linear, utilização do RMSE, RSE, MAE e R2. Na regressão logística, utilização da acurácia, precisão, revocação, F1-score e AUC-ROC.

- Dataset:

Utilizar o conjunto de dados público de preços de casas nos Estados Unidos disponível no Kaggle ou UCI.

## Dependências
As dependências necessárias para a execução do código podem ser instaladas através do gerenciador de pacotes Python, pip.As dependências necessárias para a execução do código podem ser instaladas através do gerenciador de pacotes Python, pip. As principais bibliotecas utilizadas neste projeto são:

- matplotlib
- mlxtend
- numpy
- pandas
- scikit-learn
- seaborn

## Execução
Para executar o código, é necessário ter o Python instalado. Após clonar ou baixar o repositório, instale as dependências utilizando o seguinte comando:

`pip install -r requirements.txt`

Em seguida, execute o arquivo principal:

`python prices_prediction.py`

## Conclusão
Este projeto abordou a análise e modelagem de um conjunto de dados de preços de casas nos Estados Unidos. Foram exploradas técnicas de regressão linear, classificação, clusterização, redução de dimensionalidade, análise de associação e identificação de outliers. As métricas foram utilizadas para avaliar e comparar os modelos criados. Espera-se que este trabalho sirva como ponto de partida para estudos mais avançados e aplicações práticas na área de previsão de preços de casas.
