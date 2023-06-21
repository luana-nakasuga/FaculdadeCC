# Atividade avaliativa C3A2 - Interpretação de Modelos de Machine Learning

Este projeto tem como objetivo explorar a interpretação de modelos de Machine Learning,
focando em dois modelos selecionados: Regressão Linear e Regressão Logística.
A interpretabilidade dos modelos é essencial para satisfazer a necessidade dos usuário em compreender como os resultados foram obtidos.


## Contexto
Uma demanda crescente na área de Machine Learning é a criação de modelos interpretáveis.
Os clientes buscam entender como os resultados são alcançados, o que torna a interpretabilidade dos modelos uma característica fundamental.
Nesta atividade, exploramos o [Capítulo 5 do livro "Interpretable Machine Learning"](https://christophm.github.io/interpretable-ml-book/simple.html) para acessar o site. e selecionamos os modelos de
Regressão Linear e Regressão Logística para exemplificar e explicar como interpretar os resultados obtidos por eles.


## Desenvolvimento
### Regressão Linear
Para exemplificar o modelo de Regressão Linear, foi criado um dataset relacionado à ginástica.
O dataset contém as colunas "horas_treino" e "nota_competição". Com base nesse dataset, foi definido os coeficientes do modelo de Regressão Linear,
plotação do gráfico da regressão linear e realização das avaliações do modelo.

### Regressão Logística
Para exemplificar o modelo de Regressão Logística, utilizamos o dataset "load_breast_cancer" do módulo sklearn.datasets.
Definimos a variável alvo (target), separamos os dados em conjuntos de treino e teste, realizamos o treinamento e a previsão utilizando
o conjunto de teste. Além disso, plotamos a matriz de confusão e aplicamos métricas de avaliação para avaliar o desempenho do modelo.

- Validação Cruzada

  Foi realizado também a validação cruzada (cross-validation) com 10-folds utilizando o modelo de Regressão Logística e o
  mesmo dataset utilizado anteriormente. A validação cruzada é uma técnica importante para estimar o desempenho do modelo de forma mais robusta.


## Resultados e Conclusão
Durante o desenvolvimento deste projeto, foi realizado a análise dos modelos de Regressão Linear e Regressão Logística,
destacando a interpretação dos resultados obtidos por eles. O uso de gráficos, métricas de avaliação e técnicas como a validação cruzada
permitiu a melhor compreensão do desempenho e a interpretação desses modelos.
A interpretabilidade dos modelos de Machine Learning é fundamental para atender às demandas dos clientes e fornecer insights
sobre como os resultados foram alcançados.

Neste projeto, foi adquirido bons conhecimentos sobre a interpretação de modelos de Machine Learning e como comunicar essas interpretações
de forma eficaz.

## Contribuições e Feedback
Contribuições e feedback são bem-vindos! 
Se você tiver alguma sugestão, ideia ou correção relacionada a este projeto, sinta-se à vontade para
abrir um problema (issue) ou enviar um pull request neste repositório.
